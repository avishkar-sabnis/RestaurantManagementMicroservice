package com.RestaurantManager.ApiGateway.API.Gateway.For.Microservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Component
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

    public userModel(String userName, String userAddress, double userBill, int userId) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userBill = userBill;
        this.userId = userId;
    }
}
