package com.primemart.service;

import java.util.List;

import com.primemart.dto.request.ProductRequest;
import com.primemart.dto.response.ProductResponse;

public interface ProductService {

    ProductResponse addProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

    ProductResponse updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);

    List<ProductResponse> searchProducts(String keyword);

}