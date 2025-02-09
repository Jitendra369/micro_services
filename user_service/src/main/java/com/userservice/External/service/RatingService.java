package com.userservice.External.service;


import com.userservice.dto.RatingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    @PostMapping("/api/core/rating/save")
    public Optional<RatingDto> saveRating(RatingDto ratingDto);
}
