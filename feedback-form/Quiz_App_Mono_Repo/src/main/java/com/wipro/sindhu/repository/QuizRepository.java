package com.wipro.sindhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.sindhu.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
