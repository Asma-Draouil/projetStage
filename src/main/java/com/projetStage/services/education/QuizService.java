package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.dto.education.QuizDto;


public interface QuizService {
	
public QuizDto save(QuizDto quizDto);
public QuizDto findById(Integer id);
public List<QuizDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
