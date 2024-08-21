package com.lcwd.user.service.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    //extra properties that you want to manage
    public ResourceNotFoundException(){
        super("Resource not found on Server!!!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
