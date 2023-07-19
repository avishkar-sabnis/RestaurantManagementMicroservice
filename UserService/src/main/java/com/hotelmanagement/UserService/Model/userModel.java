package com.hotelmanagement.UserService.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant_manager")
public class userModel {



    @Column(name = "userName")
    String userName;
    @Column(name = "userAddress")
    String userAddress;
    @Column(name = "userBill")
    double userBill;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    int userId;

    @Transient
    List<Ratings> ratingsModel = new ArrayList<>();





}
