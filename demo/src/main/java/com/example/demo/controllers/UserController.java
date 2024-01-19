package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/by-email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User person) {
        return ResponseEntity.ok(person);
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User person) {
        return ResponseEntity.ok(person);
    }
}




