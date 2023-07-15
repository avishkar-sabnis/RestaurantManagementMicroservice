package com.RestaurantManager.ApiGateway.API.Gateway.For.Microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class jwtController {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Autowired
    JWTUtil jwtUtil;

   @Autowired
   AuthenticationManager authenticationManager;





    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody jwtRequest jwtReq) throws Exception {
        try{

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtReq.getUserName(),jwtReq.getPassword()));


        }catch (BadCredentialsException ae){
            ae.printStackTrace();
            throw new Exception("Bad Credentials !!");
        }

        UserDetails userdet = customUserDetailsService.loadUserByUsername(jwtReq.getUserName());
        String token = jwtUtil.generateToken(userdet);
        return ResponseEntity.ok(new jwtResponse(token));
    }

}
