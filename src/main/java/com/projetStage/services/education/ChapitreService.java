package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Chapitre;

public interface ChapitreService {
public void save(Chapitre chapitre);
public Chapitre findById(Integer id);
public List<Chapitre> findAll();
public void deleteById(Integer id);
public void deleteAll();	
	
	
}
