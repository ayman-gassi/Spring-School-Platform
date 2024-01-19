package com.example.demo.services;

import com.example.demo.models.Exam;
import com.example.demo.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public Exam getExam(String name) {
        return examRepository.findByName(name);
    }

}




