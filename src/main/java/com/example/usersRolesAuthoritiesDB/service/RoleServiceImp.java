package com.example.usersRolesAuthoritiesDB.service;

import com.example.usersRolesAuthoritiesDB.dto.RoleDto;
import com.example.usersRolesAuthoritiesDB.model.Role;
import com.example.usersRolesAuthoritiesDB.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Optional<Role> findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }

    @Override
    public Role save(RoleDto roleDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role update(RoleDto roleDto) {
        return save(roleDto);
    }
}
