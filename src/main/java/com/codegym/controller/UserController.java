package com.codegym.controller;

import java.security.Principal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/users")
    public String user( ) {
        // Get authenticated user name from Principal
        return "user";
    }

    @GetMapping("/admins")
    public String admin( ) {
        // Get authenticated user name from SecurityContext
        return "admin";
    }
}