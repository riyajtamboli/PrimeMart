package com.primemart.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class WishlistResponse {

    private Long id;

    private Long productId;

    private String productName;

    private String imageUrl;

    private BigDecimal price;
}