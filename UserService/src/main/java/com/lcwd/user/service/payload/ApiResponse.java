package com.lcwd.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

//using lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//using builder pattern
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
