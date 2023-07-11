package com.hotelmanagement.UserService.Controller;


import com.hotelmanagement.UserService.Model.userModel;
import com.hotelmanagement.UserService.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@ComponentScan
@RequestMapping("/restaurantMapping")
public class userController {

    @Autowired
    userService userServe;

    @PostMapping("/insertUser")
    public userModel insertUser(@RequestBody userModel user){

        return userServe.insertUser(user);
    }


    @PutMapping("/updateUser/{userID}")
    public userModel updateUser(@PathVariable("userID") int userID ,
                               @RequestBody userModel user) throws Exception {

        return userServe.updateUser(userID,user);
    }

    @GetMapping("/getUserById/{userId}")
    public userModel getUser (@PathVariable("userId") int userId){
        return userServe.getUser(userId);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deletUserById(@PathVariable("userId") int userId)  {
        userServe.deletUserById(userId);
    }

    @GetMapping("/getAllUsers/")
    public Iterable<userModel> getListOfAllUsers(){
        return userServe.getListOfAllUsers();
    }


}
