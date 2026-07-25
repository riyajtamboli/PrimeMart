package com.primemart.service;

import java.util.List;

import com.primemart.dto.request.UserRequest;
import com.primemart.dto.response.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    UserResponse getUserById(Long id);

    List<UserResponse> getAllUsers();

    UserResponse updateUser(Long id, UserRequest request);

    void deleteUser(Long id);

}