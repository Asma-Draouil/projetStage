package com.projetStage.paiement;

import java.util.List;



public interface PaiementService {

public void save(Paiement paiement);
public Paiement findById(Integer id);
public List<Paiement> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
