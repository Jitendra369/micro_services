package com.hotelService.service;

import com.hotelService.entity.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);
    Optional<Hotel> getHotel(int id);
    List<Hotel> getAllHotels();
    void deleteHotel(int id);
}
