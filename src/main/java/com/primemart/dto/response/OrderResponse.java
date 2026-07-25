package com.primemart.dto.response;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class OrderResponse {

    private Long id;

    private String orderNumber;

    private String orderStatus;

    private String paymentStatus;

    private String paymentMethod;

    private BigDecimal totalAmount;

    private AddressResponse shippingAddress;

    private List<OrderItemResponse> items;
}