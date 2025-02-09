package com.userservice.service;

import com.userservice.External.service.HotelService;
import com.userservice.External.service.RatingService;
import com.userservice.dto.RatingDto;
import com.userservice.dto.UserDto;
import com.userservice.entity.User;
import com.userservice.repo.UserRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RatingService ratingService;


    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public UserDto saveOrUpdateRating(UserDto userDto) {
        // Check if user is present
        return userRepo.findByEmail(userDto.getEmail()).map(user -> {
            processHotelAndRating(userDto);
            return userDto;
        }).orElseGet(()->{
            User user = mapUserDto(userDto);
//            save new User
            userRepo.save(user);
            userDto.setName(user.getName());
            userDto.setAddress(userDto.getAddress());
            userDto.setEmail(user.getEmail());
            processHotelAndRating(userDto);
            return userDto;
        });
    }

    private User mapUserDto(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setAddress(userDto.getAddress());
        user.setEmail(userDto.getEmail());
        return user;
    }

    private void processHotelAndRating(UserDto userDto){
        Optional.of(hotelService.getHotel(userDto.getHotelDto().getId())).ifPresentOrElse(hotel -> {
            // Save the rating
            RatingDto ratingDto = new RatingDto();
            ratingDto.setUserId(userDto.getId());
            ratingDto.setHotelId(userDto.getHotelDto().getId());
            ratingDto.setRating(userDto.getRatingDto().getRating());
            ratingDto.setFeedBack(userDto.getRatingDto().getFeedBack());

            ratingService.saveRating(ratingDto);

        }, () -> {
            throw new RuntimeException("Hotel is not found with id " + userDto.getHotelDto().getId());
        });
    }

    @Override
    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> viewAllUser() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }

    public void getHotelDetail(String id ){
//        Hotel hotel = hotelService.getHotel(id);
//        System.out.println(hotel);
    }
}
