package com.projetStage.chapitre;

import java.util.List;

public interface ChapitreService {
public void save(Chapitre chapitre);
public Chapitre findById(Integer id);
public List<Chapitre> findAll();
public void deleteById(Integer id);
public void deleteAll();	
	
	
}
