package com.RestaurantManager.HotelService.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotelservice")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/createHotel")
    public HotelModel createHotel(@RequestBody HotelModel hotelModel){
        return hotelService.createHotel(hotelModel);
    }


    @GetMapping("/getHotelByHotelId/{hotelId}")
    public HotelModel getHotelById(@PathVariable("hotelId") String hotelId){
        return hotelService.getHotelById(hotelId);
    }


    @GetMapping("/getAllHotels")
    public Iterable<HotelModel> getAllHotels() {
        return hotelService.getAllHotels();
    }

}
