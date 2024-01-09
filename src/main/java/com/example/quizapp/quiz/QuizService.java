package com.example.quizapp.quiz;

import com.example.quizapp.question.Question;
import com.example.quizapp.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;
    @Autowired
    QuestionRepository questionRepository;

    public void CreateQuiz(Quiz quiz, Integer questionNumber){
        Optional<Quiz> newquiz = quizRepository.findByTitle(quiz.getTitle());
        if (newquiz.isPresent()){
            throw new IllegalStateException("Quiz with title :"+ quiz.getTitle() + " already exists");
        }
        Pageable pageable = PageRequest.of(0,questionNumber);
        List<Question> questions = questionRepository.findRandomQuestions(pageable);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);

    }

    public List<Quiz> GetAllQuizes() {
        return quizRepository.findAll();
    }
}
