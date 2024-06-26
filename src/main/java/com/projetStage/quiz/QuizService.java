package com.projetStage.quiz;

import java.util.List;

public interface QuizService {
public void save(Quiz quiz);
public Quiz findById(Integer id);
public List<Quiz> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
