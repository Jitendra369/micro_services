package com.ratingservice.controller;

import com.ratingservice.entity.Rating;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public Rating saveRating(@RequestBody Rating rating){
        return ratingService.saveRating(rating);
    }

    @GetMapping("/user/{id}")
    public List<Rating> getRatingByUserId(@PathVariable int id){
        return ratingService.getRatingByUserId(id);
    }

    @GetMapping("/hotel/{id}")
    public List<Rating> getRatingByHotelId(@PathVariable int id){
        return ratingService.getAllRatingByHotelId(id);
    }

    @GetMapping("/all")
    public List<Rating> viewAllRating(){
        return ratingService.getAllRating();
    }
}
