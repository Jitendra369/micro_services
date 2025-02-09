package com.ratingservice.service;

import com.ratingservice.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Rating saveRating(Rating rating);
    List<Rating> getAllRating();
    List<Rating> getRatingByUserId(int userId);
    List<Rating> getAllRatingByHotelId(int hotelId);
}
