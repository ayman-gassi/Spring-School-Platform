package com.example.demo.repositories;

import com.example.demo.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    Exam findByName(String examName);
}

