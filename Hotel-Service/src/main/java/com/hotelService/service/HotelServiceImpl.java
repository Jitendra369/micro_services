package com.hotelService.service;

import com.hotelService.entity.Hotel;
import com.hotelService.repo.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public Optional<Hotel> getHotel(int id) {
        return hotelRepo.findById(id);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public void deleteHotel(int id) {
        hotelRepo.deleteById(id);
    }
}
