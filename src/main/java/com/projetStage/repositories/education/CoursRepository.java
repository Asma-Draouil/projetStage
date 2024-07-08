package com.projetStage.repositories.education;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.education.Categorie;
import com.projetStage.models.entities.education.Chapitre;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Enseignant;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
public Page<Cours> findAll(Pageable page);
public List<Cours> findByTitreContains(String titre);
public List<Cours> findByDescriptionContains(String description);
public List<Cours> findByPrixCoursGreaterThan(float prix);
public List<Cours> findByPrixCoursLessThan(float prix);
public List<Cours> findByCategories(Categorie categorie);
public List<Cours> findByEnseignant(Enseignant enseignant);
public List<Cours> findByChapitres(Chapitre chapitre);

}
