package com.primemart.dto.request;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductRequest {

    private String name;
    private String description;
    private String brand;
    private String sku;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Integer stockQuantity;
    private Long categoryId;
}