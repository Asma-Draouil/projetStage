package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.entities.utilisateurs.Etudiant;

public interface EtudiantService {
public void save(Etudiant etudiant);
public Etudiant findById(Integer id);
public List<Etudiant> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
