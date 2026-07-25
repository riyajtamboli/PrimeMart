package com.primemart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByUserId(Long userId);

}