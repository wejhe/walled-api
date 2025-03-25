package com.bsi.walled_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsi.walled_api.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByAccountNumber(String accountNumber);
    boolean existsByAccountNumber(String accountNumber);
}
