package com.bsi.walled_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bsi.walled_api.dto.UserRequest;
import com.bsi.walled_api.dto.UserResponse;
import com.bsi.walled_api.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserRequest request);

    UserResponse toResponse(User user);
}