package com.example.demo.repositories;

import com.example.demo.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    Grade findbyGrade(String name);

    List<Grade> findByStudentName(String studentName);
}


