package com.example.quizapp.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("addquestion")
    public void addquestion(@RequestBody Question question){
        questionService.addquestion(question);
    }

    @GetMapping("category/{difficultyLevel}")
    public List<Question> GetCategorisedQuestions(@PathVariable ("difficultyLevel") String difficultyLevel){
        return (questionService.GetCategorisedQuestions(difficultyLevel));
    }

    @PutMapping("update/{questionid}")
    public void UpdateQuestion(@PathVariable("questionid") Integer id,
                               @RequestParam (required = false) String title,
                               @RequestParam (required = false) String option1,
                               @RequestParam (required = false) String option2,
                               @RequestParam (required = false) String option3,
                               @RequestParam (required = false) String option4,
                               @RequestParam (required = false) String rightanswer,
                               @RequestParam (required = false) String diffucultylevel
                               ){
        questionService.UpdateQuestion(id,title,option1,option2,option3,option4,rightanswer,diffucultylevel);
    }

    @DeleteMapping("delete/{questionid}")
    public void DeleteQuestion(@PathVariable("questionid") Integer id){
        questionService.DeleteQuestion(id);
    }


}
