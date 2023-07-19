package com.hotelmanagement.UserService.Model;


import jakarta.persistence.Id;
import lombok.*;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelModel {


    private int userId;
    @Id
    private  String hotelId;
    private  String name;
    private  String location;
    private  String about;
}