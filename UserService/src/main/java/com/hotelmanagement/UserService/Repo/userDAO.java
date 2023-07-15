package com.hotelmanagement.UserService.Repo;

import com.hotelmanagement.UserService.Model.userModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userDAO extends CrudRepository<userModel,Integer> {

    public userModel findByUserName(String username);

}
