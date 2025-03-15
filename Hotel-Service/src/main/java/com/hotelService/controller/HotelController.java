package com.hotelService.controller;

import com.hotelService.entity.Hotel;
import com.hotelService.service.HotelService;
import com.hotelService.service.HotelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;

    @GetMapping()
    public List<Hotel> getAllHotelsV1(){
        return hotelService.getAllHotels();
    }


    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel){
        return hotelService.saveHotel(hotel);
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable int id){
        return hotelService.getHotel(id).orElse(null);
    }
}
