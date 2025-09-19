package com.huukhanh19.indentity_service.mapper;

import com.huukhanh19.indentity_service.dto.request.UserCreationRequest;
import com.huukhanh19.indentity_service.dto.request.UserUpdateRequest;
import com.huukhanh19.indentity_service.dto.response.UserResponse;
import com.huukhanh19.indentity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
