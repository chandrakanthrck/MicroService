package com.lcwd.user.service.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//no need to store in database as this will be the data received from another service
public class Ratings {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
