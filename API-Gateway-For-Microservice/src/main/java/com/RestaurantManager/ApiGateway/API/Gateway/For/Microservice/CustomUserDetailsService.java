package com.RestaurantManager.ApiGateway.API.Gateway.For.Microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    userModel users;

    /*@Autowired
    userDAO daolayer;
*/

    RestTemplate restTemplate = new RestTemplate();


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {



       /* if(userName.equals(userName)){
            //userModel usersnamevalue = daolayer.findByUsername(userName);
            userModel usersnamevalue = restTemplate.getForObject("http://USER-SERVICE/ratingsmanager/restaurantMapping/userId/" +userName, userModel.class);


            return new User(usersnamevalue.getUserName(),usersnamevalue.getUserName(),new ArrayList<>());
        }
        else throw new UsernameNotFoundException("user not found");*/

        if(userName.equals("Durgesh")){
            return new User("Durgesh","Durgesh",new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("user not found");
        }

    }



}
