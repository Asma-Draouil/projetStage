package com.projetStage.services.communication;

import java.util.List;

import com.projetStage.models.dto.communication.EvaluationDto;


public interface EvaluationService {
public EvaluationDto save(EvaluationDto evaluationDto);
public EvaluationDto findById(Integer id);
public List<EvaluationDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
