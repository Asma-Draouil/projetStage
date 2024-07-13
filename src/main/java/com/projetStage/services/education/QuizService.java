package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.education.QuizDto;


public interface QuizService {
	
public QuizDto save(QuizDto quizDto);
public Optional<QuizDto> findById(Integer id);
public List<QuizDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
