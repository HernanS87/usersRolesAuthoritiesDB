package com.example.usersRolesAuthoritiesDB.service;

import com.example.usersRolesAuthoritiesDB.dto.UserSecDto;
import com.example.usersRolesAuthoritiesDB.model.UserSec;

import java.util.List;
import java.util.Optional;

public interface UserSecService {

    List<UserSec> findAll();
    Optional<UserSec> findById(Long id);
    Optional<UserSec> findUserSecByUsername(String name);
    UserSec save(UserSecDto userSecDto);
    void deleteById(Long id);
    UserSec update(UserSecDto userSecDto);
}
