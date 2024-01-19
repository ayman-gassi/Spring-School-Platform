package com.example.demo.repositories;

import com.example.demo.models.Exam;
import com.example.demo.models.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field, Long> {
    Field findByName(String name);
}

