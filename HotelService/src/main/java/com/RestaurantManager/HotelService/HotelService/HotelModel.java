package com.RestaurantManager.HotelService.HotelService;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotelmanager")
public class HotelModel {

    private int userId;
    @Id
    private  String hotelId;
    private  String name;
    private  String location;
    private  String about;
}
