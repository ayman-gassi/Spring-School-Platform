package com.example.demo;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3001", allowCredentials = "true")

public class UserRoute {
    @Autowired
    private UserService userService;
}

