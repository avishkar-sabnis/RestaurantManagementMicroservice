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
@Table(name = "ratings_manager")
public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ratingId")
    private int ratingId;
    @Column(name = "userId")
    private String userId;
    @Column(name = "hotelId")
    private String hotelId;
    @Column(name = "rating")
    private  int rating;
    @Column(name = "feedback")
    private  String feedback;

    @Transient
    HotelModel hotelModel ;


}
