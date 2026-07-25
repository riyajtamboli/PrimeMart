package com.primemart.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReviewRequest {

    @NotNull(message = "Product is required")
    private Long productId;

    @NotNull(message = "Rating is required")
    @Min(value = 1)
    @Max(value = 5)
    private Integer rating;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Comment is required")
    private String comment;
}