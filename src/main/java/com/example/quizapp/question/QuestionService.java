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

    public List<Question> GetCategorisedQuestions(String difficultyLevel){
        return questionRepository.findBydifficultyLevel(difficultyLevel);

    }

    public void UpdateQuestion(Integer id, String title, String option1, String option2,
                               String option3, String option4, String rightanswer,
                               String diffucultylevel
                               ){
        Optional<Question> updatedquestion = questionRepository.findById(id);
        if (updatedquestion.isEmpty()){
            throw new IllegalStateException("question with id: " + id + " does not exist ");
        }
        Question finalquestion = new Question(id,title,option1,option2,option3,option4,rightanswer,diffucultylevel);
        questionRepository.save(finalquestion);


    }

    public void DeleteQuestion(Integer id){
        Optional<Question> deletequestion = questionRepository.findById(id);
        if (deletequestion.isEmpty()){
            throw new IllegalStateException("question with id: " + id + " does not exist ");
        }
        questionRepository.deleteById(id);

    }



}
