package com.primemart.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String gender;
    private LocalDate dateOfBirth;

}