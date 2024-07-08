package com.projetStage.services.communication;

import java.util.List;

import com.projetStage.models.entities.communication.Evaluation;

public interface EvaluationService {
public void save(Evaluation evaluation);
public Evaluation findById(Integer id);
public List<Evaluation> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
