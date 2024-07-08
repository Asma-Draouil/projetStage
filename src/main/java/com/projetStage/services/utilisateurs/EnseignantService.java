package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.entities.utilisateurs.Enseignant;

public interface EnseignantService {
public void save(Enseignant enseignant);
public Enseignant findById(Integer id);
public List<Enseignant> findAll();
public void deleteById(Integer id);
public void deleteAll();	
public List<Enseignant> findByNomOrPrenom(String nom, String prenom);
public Enseignant findByEmail(String email);	
	
}
