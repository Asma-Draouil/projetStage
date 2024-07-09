package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.dto.utilisateurs.EnseignantDto;


public interface EnseignantService {
public void save(EnseignantDto enseignantDto);
public EnseignantDto findById(Integer id);
public List<EnseignantDto> findAll();
public void deleteById(Integer id);
public void deleteAll();	
public List<EnseignantDto> findByNomOrPrenom(String nom, String prenom);
public EnseignantDto findByEmail(String email);	
	
}
