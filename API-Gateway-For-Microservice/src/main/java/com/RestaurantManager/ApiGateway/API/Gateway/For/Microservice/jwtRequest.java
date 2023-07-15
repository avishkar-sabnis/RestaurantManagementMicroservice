package com.RestaurantManager.ApiGateway.API.Gateway.For.Microservice;

public class jwtRequest {

    String UserName;
    String Password;

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public jwtRequest(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
