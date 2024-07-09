package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.QuizDto;
import com.projetStage.models.entities.education.Quiz;



public class QuizMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static QuizDto convertToDto(Quiz quiz) {
		
		return modelMapper.map(quiz, QuizDto.class);
	}
	
	
	public static Quiz convertToEntity(QuizDto quizDto) {
		
		return modelMapper.map(quizDto, Quiz.class);
	}
}
