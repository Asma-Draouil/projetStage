package com.projetStage.categorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
public List<Categorie> findByTitreContains(String titre);
}
