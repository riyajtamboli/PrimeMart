package com.primemart.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.primemart.dto.request.ProductRequest;
import com.primemart.dto.response.ProductResponse;
import com.primemart.entity.Product;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductMapper {

    private final ModelMapper mapper;

    public Product toEntity(ProductRequest request) {
        return mapper.map(request, Product.class);
    }

    public ProductResponse toResponse(Product product) {
        return mapper.map(product, ProductResponse.class);
    }

}