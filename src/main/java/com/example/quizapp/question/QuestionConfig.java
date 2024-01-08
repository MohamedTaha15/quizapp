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
            Question question1 = new Question("questionTitle1",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "hard");

            Question question2 = new Question("questionTitle2",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "hard");

            Question question3 = new Question("questionTitle3",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "hard");

            Question question4 = new Question("questionTitle4",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "medium");

            Question question5 = new Question("questionTitle5",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "medium");

            Question question6 = new Question("questionTitle6",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "medium");

            Question question7 = new Question("questionTitle7",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "medium");

            Question question8 = new Question("questionTitle8",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "easy");

            Question question9 = new Question("questionTitle9",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "easy");

            Question question10 = new Question("questionTitle10",
                    "option1",
                    "option2",
                    "option3",
                    "option4",
                    "rightAnswer",
                    "easy");

            repository.saveAll(
                    List.of(question1,question2,question3,question4,question5,question6
                            ,question7,question8,question9,question10));


        };
    }
}
