package com.userservice.External.service;


import com.userservice.dto.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/api/core/hotel/{id}")
    Hotel getHotel(@PathVariable("id") Integer id );

}
