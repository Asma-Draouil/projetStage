package com.projetStage.services.education.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.QuizDto;
import com.projetStage.models.entities.education.Quiz;
import com.projetStage.models.mappers.education.QuizMapper;
import com.projetStage.repositories.education.QuizRepository;
import com.projetStage.services.education.QuizService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
	
	private final QuizRepository quizRepository;
	
	@Override
	public QuizDto save(QuizDto quizDto) {
	Quiz quiz = QuizMapper.convertToEntity(quizDto);
		return QuizMapper.convertToDto(quizRepository.save(quiz));
	}

	@Override
	public QuizDto findById(Integer id) {
	
		return quizRepository.findById(id).map(QuizMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun quiz trouvé avec l'ID : " +id));
	}

	@Override
	public List<QuizDto> findAll() {
	
		return quizRepository.findAll()
				.stream()
				.map(QuizMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
     quizRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
	quizRepository.deleteAll();
		
	}

}
