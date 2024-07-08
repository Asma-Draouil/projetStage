package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Cours;

public interface CoursService {
public void save(Cours cours);
public Cours findById(Integer id);
public List<Cours> findAll();
public void deleteById(Integer id);
public void deleteAll();


	
}
