package com.example.demo.models;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "responses")
public class Response {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String text;
    @Column(name = "is_correct")
    private Boolean isCorrect;
    // Getters and setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Boolean getCorrect() {
        return isCorrect;
    }
    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
