package com.projetStage.categorie;

import java.util.List;

public interface CategorieService {
public void save(Categorie categorie);
public Categorie findById(Integer id);
public List<Categorie> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
