package com.RestaurantManager.HotelService.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    HotelDAO hotelRepository;
    public HotelModel createHotel(HotelModel hotelModel) {
        return hotelRepository.save(hotelModel);
    }

    public HotelModel getHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).get();
    }

    public Iterable<HotelModel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
