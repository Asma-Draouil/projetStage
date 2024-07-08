package com.projetStage.services.communication;

import java.util.List;

import com.projetStage.models.entities.communication.Paiement;



public interface PaiementService {

public void save(Paiement paiement);
public Paiement findById(Integer id);
public List<Paiement> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
