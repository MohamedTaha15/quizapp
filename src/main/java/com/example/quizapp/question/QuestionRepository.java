package com.example.quizapp.question;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer>{
    Optional<Question> findByTitle (String title);
    void deleteById (Integer id);
    List<Question> findBydifficultyLevel(String difficultyLevel);
    @Query(value = "SELECT q FROM Question q ORDER BY random()")
    List<Question> findRandomQuestions(Pageable pageable);

}
