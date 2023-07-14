package com.ratingservice.RatingService;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ratingsmanager")
public class RatingsController {

    @Autowired
    RatingsServiceClass ratingsServiceClass;



    @PostMapping("/createRatings")
    public Ratings giveRatings(@RequestBody Ratings ratings){
        return ratingsServiceClass.giveRatings(ratings);
    }

    @GetMapping("/userRatingsFetch/getRatingsByUserId/{userId}")
    public List<Ratings> getRatingsByUserId(@PathVariable("userId") String userId){
        return ratingsServiceClass.getRatingsByUserId(userId);
    }

    @GetMapping("/hotelRatingsFetch/getRatingsByHotelId/{hotelId}")
    public List<Ratings> getRatingsByHotelId(@PathVariable("hotelId") String hotelId){
        return ratingsServiceClass.getRatingsByHotelId(hotelId);
    }

    @GetMapping("/getRatingsByRatingsId/{ratingsId}")
    public List<Ratings> getRatingsByratingsId(@PathVariable("ratingsId") int ratingId){
        return ratingsServiceClass.getRatingsByratingsId(ratingId);
    }


}
