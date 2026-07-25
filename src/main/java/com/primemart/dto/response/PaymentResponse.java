package com.primemart.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PaymentResponse {

    private Long id;

    private Long orderId;

    private String transactionId;

    private String paymentMethod;

    private String paymentStatus;

    private BigDecimal amount;
}