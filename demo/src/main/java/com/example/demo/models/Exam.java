package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "field_name")
    private String fieldName;
    @Column(name = "pic_src")
    private String picSrc;
    private String desc;
    private String teacher;
    @Column(name = "q_nbr")
    private Integer qNbr;

    // Getters and setters
}





