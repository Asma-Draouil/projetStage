package com.projetStage.models.mappers.communication;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.entities.communication.Evaluation;

public class EvaluationMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static EvaluationDto convertToDto(Evaluation evaluation) {
		
		return modelMapper.map(evaluation, EvaluationDto.class);
	}
	
	
	public static Evaluation convertToEntity(EvaluationDto evaluationDto) {
		
		return modelMapper.map(evaluationDto, Evaluation.class);
	}
}

