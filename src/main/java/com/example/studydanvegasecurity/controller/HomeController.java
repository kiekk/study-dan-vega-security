package com.example.studydanvegasecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = {"", "/"})
    public String home() {
        return "Hello World";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String user() {
        return "Hello User";
    }

    @GetMapping("/adin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String admin() {
        return "Hello Admin";
    }
}
