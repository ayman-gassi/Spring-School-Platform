package com.example.demo.services;

import com.example.demo.models.Field;
import com.example.demo.repositories.FieldRepository;
import jakarta.persistence.FieldResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService {

    @Autowired
    private FieldRepository fieldRepository;

    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }
    public FieldResult getField(String name) {
        fieldRepository.findByName(name);
        return null;
    }
}


