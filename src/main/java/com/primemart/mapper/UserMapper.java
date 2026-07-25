package com.primemart.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.primemart.dto.request.UserRequest;
import com.primemart.dto.response.UserResponse;
import com.primemart.entity.User;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final ModelMapper mapper;

    public User toEntity(UserRequest request) {
        return mapper.map(request, User.class);
    }

    public UserResponse toResponse(User user) {
        return mapper.map(user, UserResponse.class);
    }

}