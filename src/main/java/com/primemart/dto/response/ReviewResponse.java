package com.primemart.dto.response;

import lombok.Data;

@Data
public class ReviewResponse {

    private Long id;

    private Long userId;

    private String userName;

    private Integer rating;

    private String title;

    private String comment;
}