package com.projetStage.repositories.education;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.education.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
