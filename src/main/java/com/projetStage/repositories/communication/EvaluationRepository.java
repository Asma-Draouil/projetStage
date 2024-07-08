package com.projetStage.repositories.communication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.communication.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

}
