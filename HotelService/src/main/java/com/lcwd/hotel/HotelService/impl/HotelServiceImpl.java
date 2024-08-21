package com.lcwd.hotel.HotelService.impl;

import com.lcwd.hotel.HotelService.HotelServiceApplication;
import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.HotelService.repositories.HotelRespository;
import com.lcwd.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRespository hotelRespository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRespository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRespository.findAll();
    }


    @Override
    public Hotel get(String id) {
        return hotelRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given Id not found!!"));
    }
}
