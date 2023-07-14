package com.hotelmanagement.UserService.externalFeign;

import com.hotelmanagement.UserService.Model.HotelModel;
import com.hotelmanagement.UserService.Model.Ratings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RATING-SERVICE")
public interface RatingsService {



        @GetMapping("/ratingsmanager/userRatingsFetch/getRatingsByUserId/{userId}")
        Ratings ratingsGetService(@PathVariable("userId") int userId);




}
