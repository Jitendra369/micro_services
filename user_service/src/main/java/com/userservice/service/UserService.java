package com.userservice.service;

import com.userservice.dto.UserDto;
import com.userservice.entity.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    User getUser(int id);
    List<User> viewAllUser();
    void deleteUser(int id);
    public UserDto saveOrUpdateRating(UserDto userDto);

}
