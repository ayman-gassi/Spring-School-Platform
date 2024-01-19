package com.example.demo.controllers;

import com.example.demo.models.Field;
import com.example.demo.services.FieldService;
import jakarta.persistence.FieldResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fields")
public class FieldController {

    @Autowired
    private FieldService fieldService;

    @GetMapping
    public ResponseEntity<List<Field>> getAllFields() {
        return ResponseEntity.ok(fieldService.getAllFields());
    }

    @GetMapping("/{name}")
    public ResponseEntity<FieldResult> getField(@PathVariable String name) {
        return ResponseEntity.ok(fieldService.getField(name));
    }
}







