package com.lcwd.hotel.HotelService.services;

import com.lcwd.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService{
    //create
    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get by id
    Hotel get(String id);
}
