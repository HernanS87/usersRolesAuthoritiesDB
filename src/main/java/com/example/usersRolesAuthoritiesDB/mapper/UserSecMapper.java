package com.example.usersRolesAuthoritiesDB.mapper;

import com.example.usersRolesAuthoritiesDB.dto.UserSecDto;
import com.example.usersRolesAuthoritiesDB.model.Role;
import com.example.usersRolesAuthoritiesDB.model.UserSec;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserSecMapper {

    @Mapping(target = "roles", expression = "java(roles)")
    UserSec userSecDtoToEntity(UserSecDto dto, Set<Role> roles);
}
