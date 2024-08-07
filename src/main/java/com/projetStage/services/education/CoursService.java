package com.projetStage.services.education;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.dto.utilisateurs.EnseignantDto;


public interface CoursService {
	
public CoursDto save(CoursDto coursDto);
public CoursDto findById(Integer id);
public Page<CoursDto> findAll(Pageable pageable);
public void deleteById(Integer id);
public void deleteAll();
public Page<CoursDto> findByTitreContains(String titre,Pageable pageable );
public Page<CoursDto> findByDescriptionContains(String description, Pageable pageable);
public Page<CoursDto> findByPrixCoursGreaterThan(float prix, Pageable pageable);
public Page<CoursDto> findByPrixCoursLessThan(float prix, Pageable pageable);
public Page<CoursDto> findByCategories(CategorieDto categorieDto, Pageable pageable);
public Page<CoursDto> findByEnseignant(EnseignantDto enseignantDto, Pageable pageable);
public Page<CoursDto> findByEvaluations(EvaluationDto evaluationDto, Pageable pageable);

	
}
