package com.projetStage.cours;

import java.util.List;

public interface CoursService {
public void save(Cours cours);
public Cours findById(Integer id);
public List<Cours> findAll();
public void deleteById(Integer id);
public void deleteAll();


	
}
