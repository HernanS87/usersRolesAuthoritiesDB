package com.example.usersRolesAuthoritiesDB.service;

import com.example.usersRolesAuthoritiesDB.model.Permission;

import java.util.List;
import java.util.Optional;

public interface PermissionService {

    List<Permission> findAll();
    Optional<Permission> findById(Long id);
    Optional<Permission> findPermissionByName(String name);
    Permission save(Permission permission);
    void deleteById(Long id);
    Permission update(Permission permission);

}
