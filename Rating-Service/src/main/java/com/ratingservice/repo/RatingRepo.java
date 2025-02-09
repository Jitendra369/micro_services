package com.ratingservice.repo;

import com.ratingservice.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating,Integer> {

    List<Rating> findRatingByUserId(int userId);
    List<Rating> findRatingByHotelId(int hotelId);
}
