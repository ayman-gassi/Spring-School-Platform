package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.AuthMiddleware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthMiddleware authMiddleware;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        return authMiddleware.login(user.getEmail(), user.getPassword());
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        return authMiddleware.register(user);
    }
}


