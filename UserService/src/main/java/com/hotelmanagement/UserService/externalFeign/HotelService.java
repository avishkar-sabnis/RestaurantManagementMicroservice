package com.hotelmanagement.UserService.externalFeign;


import com.hotelmanagement.UserService.Model.HotelModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/hotelservice/getHotelByHotelId/{hotelId}")
    HotelModel hotelGetService(@PathVariable("hotelId") String hotelId);


}
