package com.example.quizapp.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> GetAll(){
        return questionRepository.findAll();
    }

    public void addquestion(Question question){
        Optional<Question> questionbytitle = questionRepository.findByTitle(question.getTitle());
        if (questionbytitle.isPresent()){
            throw new IllegalStateException("question already exists ");
        }
        questionRepository.save(question);
    }



}
