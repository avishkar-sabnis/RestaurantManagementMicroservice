package com.hotelmanagement.UserService.Service;


import com.hotelmanagement.UserService.Model.HotelModel;
import com.hotelmanagement.UserService.Model.Ratings;
import com.hotelmanagement.UserService.Repo.userDAO;
import com.hotelmanagement.UserService.Model.userModel;
import com.hotelmanagement.UserService.externalFeign.HotelService;
import com.hotelmanagement.UserService.externalFeign.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class userService {

    @Autowired
    userDAO repo;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HotelService hotelService;

    @Autowired
    RatingsService ratingsService;



    //create User in Database
    public userModel insertUser(userModel user) {
        return repo.save(user);
    }

    public userModel getUser(int userId)  {

            userModel users = repo.findById(userId).get();






            Ratings[] ratingslist = restTemplate.getForObject("http://RATING-SERVICE/ratingsmanager/userRatingsFetch/getRatingsByUserId/" + users.getUserId(), Ratings[].class);

            //Ratings rate = ratingsService.ratingsGetService(rating)

            List<Ratings> ratings = Arrays.stream(ratingslist).toList();
            List<Ratings> ratingList = ratings.stream().map(rating -> {

                //ResponseEntity<HotelModel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotelservice/getHotelByHotelId/"+rating.getHotelId(), HotelModel.class);
                HotelModel hotel = hotelService.hotelGetService(rating.getHotelId());
                rating.setHotelModel(hotel);
                //return the rating
                return rating;
            }).collect(Collectors.toList());

            users.setRatingsModel(ratingList);





        return users;


    }

    //update user with ID
    public userModel updateUser(int userId, userModel user) throws Exception {
        userModel datafromDB = repo.findById(userId).get();
        int id = datafromDB.getUserId();
        if (userId == id) {

            datafromDB.setUserAddress(user.getUserAddress());
            datafromDB.setUserName(user.getUserName());
            datafromDB.setUserBill(user.getUserBill());
        }
        return repo.save(datafromDB);

    }

    public String getUserByUsername(String userName){
    userModel use = repo.findByUserName(userName);
    String usersName = use.getUserName();
    return usersName;
    }



    public void deletUserById(int userId)  {
        repo.deleteById(userId);
    }


    public Iterable<userModel> getListOfAllUsers(){
        return repo.findAll();
    }

}




