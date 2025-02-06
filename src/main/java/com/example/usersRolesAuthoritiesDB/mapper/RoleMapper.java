package com.example.usersRolesAuthoritiesDB.mapper;

import com.example.usersRolesAuthoritiesDB.dto.RoleDto;
import com.example.usersRolesAuthoritiesDB.model.Permission;
import com.example.usersRolesAuthoritiesDB.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.Set;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {

    @Mapping(target = "permissions", expression = "java(permissions)")
    Role roleDtoToEntity(RoleDto dto, Set<Permission> permissions);

}

