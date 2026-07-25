package com.primemart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByBrand(String brand);

}