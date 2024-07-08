package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Categorie;

public interface CategorieService {
public void save(Categorie categorie);
public Categorie findById(Integer id);
public List<Categorie> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
