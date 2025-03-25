package com.bsi.walled_api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bsi.walled_api.model.Transaction.TransactionType;

import lombok.Data;

@Data
public class TransactionResponse {
    private Long id;
    private Long walletId;
    private TransactionType transactionType;
    private BigDecimal amount;
    private Long recipientWalletId;
    private LocalDateTime transactionDate;
    private String description;
}