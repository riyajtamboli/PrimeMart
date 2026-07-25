package com.primemart.dto.response;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class CartResponse {

    private Long id;

    private Long userId;

    private List<CartItemResponse> items;

    private BigDecimal totalAmount;
}