package com.bsi.walled_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsi.walled_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByPhoneNumber(String phoneNumber);
}