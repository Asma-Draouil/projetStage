package com.projetStage.services.communication;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.communication.EvaluationDto;


public interface EvaluationService {
public EvaluationDto save(EvaluationDto evaluationDto);
public Optional<EvaluationDto> findById(Integer id);
public List<EvaluationDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
