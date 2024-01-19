package com.example.demo.services;

import com.example.demo.models.Grade;
import com.example.demo.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }
    public boolean addGrade(String examName, String studentName, String note) {
        try {
            Grade newGrade = new Grade();
            newGrade.setExamName(examName);
            newGrade.setStudentName(studentName);
            newGrade.setNote(note);

            gradeRepository.save(newGrade);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Grade> getGrades(String studentEmail) {
        try {
            return gradeRepository.findByStudentName(studentEmail);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


