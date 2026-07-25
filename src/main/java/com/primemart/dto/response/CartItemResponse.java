package com.primemart.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CartItemResponse {

    private Long id;

    private Long productId;

    private String productName;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal subtotal;
}