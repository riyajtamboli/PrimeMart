package com.primemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {

}