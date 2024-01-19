package com.example.demo.controllers;

import com.example.demo.models.Exam;
import com.example.demo.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/{name}")
    public ResponseEntity<Exam> getExam(@PathVariable String name) {
        return ResponseEntity.ok(examService.getExam(name));
    }
}








