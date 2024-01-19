package com.example.demo.services;

import com.example.demo.models.Exam;
import com.example.demo.models.Question;
import com.example.demo.repositories.ExamRepository;
import com.example.demo.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ExamRepository examRepository;

    public List<Question> getAllQuestions(String examName) {
        Exam exam = examRepository.findByName(examName);
        if (exam != null) {
            return questionRepository.findByExam(exam);
        } else {
            return null;
        }
    }
}



