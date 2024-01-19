package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.MUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final MUserRepository userRepository;
    @Autowired
    public UserService(MUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUserInfo(String userId) {
        try {
            return userRepository.findById(userId).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<User> getAllUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public User getUserByEmail(String email) {
        try {
            return userRepository.findByEmail(email).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
