package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.dto.utilisateurs.EnseignantDto;


public interface CoursService {
	
public CoursDto save(CoursDto coursDto);
public Optional<CoursDto> findById(Integer id);
public Page<CoursDto> findAll(Pageable pageable);
public void deleteById(Integer id);
public void deleteAll();
public Optional<List<CoursDto>> findByTitreContains(String titre);
public Optional<List<CoursDto>> findByDescriptionContains(String description);
public Optional<List<CoursDto>> findByPrixCoursGreaterThan(float prix);
public Optional<List<CoursDto>> findByPrixCoursLessThan(float prix);
public Optional<List<CoursDto>> findByCategories(CategorieDto categorieDto);
public Optional<List<CoursDto>> findByEnseignant(EnseignantDto enseignantDto);
public Optional<List<CoursDto>> findByEvaluations(EvaluationDto evaluationDto);
	
}
