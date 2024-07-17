package com.projetStage.services.communication.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.entities.communication.Evaluation;
import com.projetStage.models.mappers.communication.EvaluationMapper;
import com.projetStage.repositories.communication.EvaluationRepository;
import com.projetStage.services.communication.EvaluationService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EvaluationServiceImpl implements EvaluationService{

	private final EvaluationRepository evaluationRepository;
	
	@Override
	public EvaluationDto save(EvaluationDto evaluationDto) {
		Evaluation evaluation = EvaluationMapper.convertToEntity(evaluationDto);
		return EvaluationMapper.convertToDto(evaluationRepository.save(evaluation));
	}

	@Override
	public EvaluationDto findById(Integer id) {
		
		return evaluationRepository.findById(id).map(EvaluationMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucune evaluation trouvée avec l'ID : " +id));
	}

	@Override
	public List<EvaluationDto> findAll() {
		
		return evaluationRepository.findAll()
				.stream()
				.map(EvaluationMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		evaluationRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		evaluationRepository.deleteAll();
		
	}

}
