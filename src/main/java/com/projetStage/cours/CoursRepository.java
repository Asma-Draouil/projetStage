package com.projetStage.cours;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.categorie.Categorie;
import com.projetStage.chapitre.Chapitre;
import com.projetStage.enseignant.Enseignant;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
public Page<Cours> findAll(Pageable page);
public List<Cours> findByTitreCoursContains(String titre);
public List<Cours> findByDescriptionCoursContains(String description);
public List<Cours> findByPrixCoursGreaterThan(float prix);
public List<Cours> findByPrixCoursLessThan(float prix);
public List<Cours> findByCategories(Categorie categorie);
public List<Cours> findByEnseignant(Enseignant enseignant);
public List<Cours> findByChapitres(Chapitre chapitre);

}
