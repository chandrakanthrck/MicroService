package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.entities.User;

import java.util.List;
//to write logic for users
public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);

}
