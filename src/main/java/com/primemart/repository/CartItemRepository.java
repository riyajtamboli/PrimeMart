package com.primemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}