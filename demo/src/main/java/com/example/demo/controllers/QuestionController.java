package com.example.demo.controllers;

import com.example.demo.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/start/{name}")
    public ResponseEntity<Object> startExam(@PathVariable String name) {
        return ResponseEntity.ok(questionService.getAllQuestions(name));
    }
}







