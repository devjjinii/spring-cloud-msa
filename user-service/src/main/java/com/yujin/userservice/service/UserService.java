package com.yujin.userservice.service;

import com.yujin.userservice.dto.UserDto;
import com.yujin.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
