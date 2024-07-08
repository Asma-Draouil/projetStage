package com.projetStage.repositories.education;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.education.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
public List<Categorie> findByTitreContains(String titre);
}
