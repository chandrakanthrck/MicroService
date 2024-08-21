package com.lcwd.user.service.UserService.services.impl;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import com.lcwd.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    //to save data on database
    @Autowired
    private UserRepository userRepository;

    //for rest template impl to get ratings from ratings service
    @Autowired
    private RestTemplate restTemplate;
    //task to do
    @Override
    public User saveUser(User user) {
        //generate unique IDs
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        //db operation
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        //if userId found, return user if not throw exception
        //get user from database with the help of user repository
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User given ID not found on server!:" + userId));
        //fetch rating of the above user from RATING SERVICE
        //we can do it with the help of fein client, or rest template

        //rest template implementation


        return user;
    }
}
