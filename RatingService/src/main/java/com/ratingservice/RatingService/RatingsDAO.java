package com.ratingservice.RatingService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingsDAO extends CrudRepository<Ratings, Integer> {

    public List<Ratings> findByUserId(String userId);

    public List<Ratings> findByHotelId(String hotelId);


    public List<Ratings> findByRatingId(int ratingId);
}
