package com.example.quizapp.question;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class QuestionConfig {

    @Bean
    CommandLineRunner commandLineRunner(QuestionRepository repository){
        return args -> {
            Question question1 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question2 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question3 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question4 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question5 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question6 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question7 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question8 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question9 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            Question question10 = new Question("questionTitle",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "difficultyLevel");

            repository.saveAll(
                    List.of(question1,question2,question3,question4,question5,question6
                            ,question7,question8,question9,question10));


        };
    }
}
