package com.lcwd.user.service.UserService.repositories;

import com.lcwd.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//this is created to perform database operations on the table
public interface UserRepository extends JpaRepository<User, String> {
    //if you want to implement any custom method/query
    //write
}
