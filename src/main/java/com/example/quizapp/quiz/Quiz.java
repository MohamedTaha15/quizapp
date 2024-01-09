package com.example.quizapp.quiz;

import com.example.quizapp.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Quiz {
    @Id
    @SequenceGenerator(
            name = "quiz_sequence",
            sequenceName = "quiz_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "quiz_sequence")
    private Integer id;
    private String title;
    @ManyToMany
    private List<Question> questions;

    public Quiz(String title) {
        this.title = title;
    }

    public Quiz(Integer id, String title, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.questions = questions;
    }

    public Quiz() {

    }
}
