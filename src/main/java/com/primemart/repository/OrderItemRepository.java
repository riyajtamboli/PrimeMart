package com.primemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}