//package com.example.demo.controllers;
//
//import com.example.demo.models.Grade;
//import com.example.demo.services.GradeService;
//import com.example.demo.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/grades")
//public class GradeController {
//
//    @Autowired
//    private GradeService gradeService;
//
//    @PostMapping("/save/{exam}/{grade}")
//    public ResponseEntity<Boolean> saveGrade(@PathVariable String exam, @PathVariable String grade) {
//        return ResponseEntity.ok(gradeService.addGrade(exam, UserService.g.getEmail(), grade));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Grade>> getGrades() {
//        return ResponseEntity.ok(gradeService.getGrades(UserService.getEmail()));
//    }
//
//}
//
//
//
//
//
//
//
//
