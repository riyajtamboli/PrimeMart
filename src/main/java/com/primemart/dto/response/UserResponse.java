package com.primemart.dto.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String gender;

    private LocalDate dateOfBirth;

    private String profileImage;

    private Boolean enabled;

    private String role;
}