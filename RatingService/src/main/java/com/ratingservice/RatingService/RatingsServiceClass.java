package com.ratingservice.RatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingsServiceClass {

    @Autowired
    RatingsDAO ratingsDAO;

    public Ratings giveRatings(Ratings ratings){
        return ratingsDAO.save(ratings);
    }

    public List<Ratings> getRatingsByUserId(String userId){
        return ratingsDAO.findByUserId(userId);
    }

    public List<Ratings> getRatingsByHotelId(String hotelId){
        return ratingsDAO.findByHotelId(hotelId);
    }
    public List<Ratings> getRatingsByratingsId(int ratingId){
        return ratingsDAO.findByRatingId(ratingId);
    }



}
