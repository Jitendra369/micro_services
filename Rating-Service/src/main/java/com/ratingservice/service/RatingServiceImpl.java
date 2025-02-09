package com.ratingservice.service;

import com.ratingservice.entity.Rating;
import com.ratingservice.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(int userId) {
        return ratingRepo.findRatingByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingByHotelId(int hotelId) {
        return ratingRepo.findRatingByHotelId(hotelId);
    }
}
