package com.primemart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primemart.entity.Role;
import com.primemart.enums.RoleType;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(RoleType roleName);

}