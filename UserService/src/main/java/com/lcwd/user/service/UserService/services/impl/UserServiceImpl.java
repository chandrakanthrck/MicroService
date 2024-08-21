package com.lcwd.user.service.UserService.services.impl;

import com.lcwd.user.service.UserService.entities.Rating;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import com.lcwd.user.service.UserService.services.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    //to save data on database
    @Autowired
    private UserRepository userRepository;
    //to communicate with other services
    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

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
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User given ID not found on server!:" + userId));
        //fetch rating of the above user from RATING SERVICE
        //we can do it with the help of fiegn client, or rest template

        //rest template implementation
        //restTemplate.getForObject -> sendsa HTTP GET request to the specified URL and converts it into an instance of the specified class
        //ArrayList -> to desrialize it to ArrayList of Rating object
        ArrayList<Rating> ratingsOfUser = restTemplate.getForObject("http://localhost:8083/ratings/users/"+user.getUserId(), ArrayList.class);
        logger.info("{}",ratingsOfUser);
        user.setRatings(ratingsOfUser);
        return user;
    }
}
