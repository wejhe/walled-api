package com.bsi.walled_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.bsi.walled_api.dto.WalletResponse;
import com.bsi.walled_api.model.Wallet;

@Mapper(componentModel = "spring")
public interface WalletMapper {
    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    @Mapping(source = "user.id", target = "userId")
    WalletResponse toResponse(Wallet wallet);
}