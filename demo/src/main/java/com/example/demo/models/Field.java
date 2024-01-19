package com.example.demo.models;

import jakarta.persistence.*;
@Entity
@Table(name = "fields")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "pic_src")
    private String picSrc;
    @Column(name = "e_nbr")
    private Integer eNbr;
    private String desc;
    // Getters and setters
}



