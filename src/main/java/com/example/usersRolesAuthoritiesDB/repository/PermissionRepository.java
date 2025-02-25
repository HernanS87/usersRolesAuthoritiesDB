package com.example.usersRolesAuthoritiesDB.repository;

import com.example.usersRolesAuthoritiesDB.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<Permission> findPermissionByName(String name);
}
