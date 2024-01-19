package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "exam_name")
    private String examName;
    private String grade;

    public void setExamName(String examName) {
    }

    public void setStudentName(String studentName) {
    }

    public void setNote(String note) {
    }
    // Getters and setters
}




