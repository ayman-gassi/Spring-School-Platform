package com.example.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private List<Response> responses;
    // Getters and setters
}




