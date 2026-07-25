package com.primemart.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.primemart.dto.request.UserRequest;
import com.primemart.dto.response.UserResponse;
import com.primemart.entity.User;
import com.primemart.exception.DuplicateResourceException;
import com.primemart.exception.ResourceNotFoundException;
import com.primemart.mapper.UserMapper;
import com.primemart.repository.UserRepository;
import com.primemart.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse registerUser(UserRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new DuplicateResourceException("Email already exists.");
        }

        if (userRepository.existsByPhone(request.getPhone())) {
            throw new DuplicateResourceException("Phone number already exists.");
        }

        User user = userMapper.toEntity(request);

        User savedUser = userRepository.save(user);

        return userMapper.toResponse(savedUser);
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse getUserById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with ID: " + id));

        return userMapper.toResponse(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserResponse> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(userMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest request) {

        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with ID: " + id));

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPhone(request.getPhone());
        user.setGender(request.getGender());
        user.setDateOfBirth(request.getDateOfBirth());

        User updated = userRepository.save(user);

        return userMapper.toResponse(updated);
    }

    @Override
    public void deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with ID: " + id));

        userRepository.delete(user);
    }
}