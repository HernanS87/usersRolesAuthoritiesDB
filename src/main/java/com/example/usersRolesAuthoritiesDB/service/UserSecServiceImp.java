package com.example.usersRolesAuthoritiesDB.service;

import com.example.usersRolesAuthoritiesDB.dto.UserSecDto;
import com.example.usersRolesAuthoritiesDB.model.Role;
import com.example.usersRolesAuthoritiesDB.model.UserSec;
import com.example.usersRolesAuthoritiesDB.repository.UserSecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSecServiceImp implements UserSecService{

    @Autowired
    private UserSecRepository userRepository;

    @Override
    public List<UserSec> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserSec> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserSec> findUserSecByUsername(String name) {
        return userRepository.findUserSecByUsername(name);
    }

    @Override
    public UserSec save(UserSecDto userDto) {
        return null;
    }


    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserSec update(UserSecDto userDto) {
        return save(userDto);
    }
}
