package com.yujin.userservice.service;

import com.yujin.userservice.dto.UserDto;
import com.yujin.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
