package com.primemart.dto.response;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class ProductResponse {

    private Long id;

    private String name;

    private String description;

    private String brand;

    private String sku;

    private BigDecimal price;

    private BigDecimal discountPrice;

    private Integer stockQuantity;

    private String productStatus;

    private CategoryResponse category;

    private List<String> images;
}