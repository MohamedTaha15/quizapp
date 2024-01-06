package com.example.quizapp.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> GetAllQuestions(){
        return questionService.GetAll();
    }


}