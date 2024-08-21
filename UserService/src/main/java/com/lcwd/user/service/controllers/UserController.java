package com.lcwd.user.service.controllers;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //create
    //sending response after creating
    //using @RequestBody, the body get deserialized
    //when you use post mapping on /users this method runs
    //using post mapping it creates
    @PutMapping("create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        //to save this data, we must use saveUser
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single user get
    //using get mapping it returns
    @GetMapping("/{userId}")
    //using @PathVariable, the userId that comes in getmapping will be used
    //as parameter inside getSingleUser
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        //getting user
       User user =  userService.getUser(userId);
       //.ok() for status 200 ok
       return ResponseEntity.ok(user);
    }

    //all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }
}
