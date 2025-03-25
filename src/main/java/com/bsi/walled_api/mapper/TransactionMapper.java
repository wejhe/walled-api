package com.bsi.walled_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.bsi.walled_api.dto.TransactionResponse;
import com.bsi.walled_api.model.Transaction;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(source = "wallet.id", target = "walletId")
    @Mapping(source = "recipientWallet.id", target = "recipientWalletId")
    TransactionResponse toResponse(Transaction transaction);
}