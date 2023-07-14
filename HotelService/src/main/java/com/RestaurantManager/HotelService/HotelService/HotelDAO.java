package com.RestaurantManager.HotelService.HotelService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDAO extends CrudRepository<HotelModel,String> {
}
