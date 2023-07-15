package com.RestaurantManager.ApiGateway.API.Gateway.For.Microservice;

public class jwtResponse {

    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public jwtResponse(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "jwtResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}
