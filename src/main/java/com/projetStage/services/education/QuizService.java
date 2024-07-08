package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Quiz;

public interface QuizService {
public void save(Quiz quiz);
public Quiz findById(Integer id);
public List<Quiz> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
