package com.example.usersRolesAuthoritiesDB.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello/")
@PreAuthorize("denyAll()")
public class HelloWorldController {

    @GetMapping("security")
    @PreAuthorize("hasAuthority('READ')")
    public String helloWidthSec(){
        return "Hello World width SECURITY";
    }

    @GetMapping("free")
    @PreAuthorize("permitAll()")
    public String helloFree(){
        return "Hello World FREE";
    }

    @GetMapping("autenticado")
    @PreAuthorize("isAuthenticated()")
    public String helloFree2(){
        return "Hello World AUTHENTICATED";
    }
}



