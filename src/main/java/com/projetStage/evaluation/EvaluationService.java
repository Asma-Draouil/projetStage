package com.projetStage.evaluation;

import java.util.List;

public interface EvaluationService {
public void save(Evaluation evaluation);
public Evaluation findById(Integer id);
public List<Evaluation> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
