package com.lcwd.user.service.UserService.exceptions;

import com.lcwd.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//it becomes centralized exception handler
@RestControllerAdvice
public class GlobalExceptionHandler {
    //when exception happens throughout anywhere in the project, it will run this method
    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();
        //by using builder, we can build multiple objects in a single line
        //here by using builder, message = message, success = true, status = not_found
        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();;
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
}
