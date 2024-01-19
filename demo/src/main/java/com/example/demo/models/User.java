package com.example.demo.models;

import com.example.demo.enums.Gender;
import com.example.demo.enums.Job;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Job job;
    private String password;
    public  String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public User orElse(Object o) {
    }
}

