package com.projetStage.repositories.communication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.communication.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Integer> {

}
