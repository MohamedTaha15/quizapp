package com.example.quizapp.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("create/{questionNumber}")
    public void CreateQuiz(@RequestBody Quiz quiz,
                           @PathVariable("questionNumber") Integer questionNumber){

        quizService.CreateQuiz(quiz,questionNumber);

    }

    @GetMapping
    public List<Quiz> GetAllQuizes(){
        return quizService.GetAllQuizes();
    }

}
