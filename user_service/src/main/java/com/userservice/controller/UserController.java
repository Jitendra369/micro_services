package com.userservice.controller;

import com.userservice.dto.RatingDto;
import com.userservice.dto.UserDto;
import com.userservice.entity.User;
import com.userservice.service.UserService;
import com.userservice.service.UserServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/user")
@NoArgsConstructor
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> viewAllUser(){
        return userService.viewAllUser();
    }

    @PostMapping("/update/rating")
    public UserDto updateRating(@RequestBody UserDto userDto){
        return userService.saveOrUpdateRating(userDto);
    }
}
