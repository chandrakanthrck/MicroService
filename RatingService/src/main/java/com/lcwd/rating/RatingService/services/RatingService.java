package com.lcwd.rating.RatingService.services;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get by id
    List<Rating> getRatingByUserId(String userId);

    //get by hotel id
    List<Rating> getRatingbyHotelId(String hotelId);
}
