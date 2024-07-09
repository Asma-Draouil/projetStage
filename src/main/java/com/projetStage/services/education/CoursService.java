package com.projetStage.services.education;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.dto.utilisateurs.EnseignantDto;


public interface CoursService {
	
public void save(CoursDto coursDto);
public CoursDto findById(Integer id);
public Page<CoursDto> findAll(Pageable pageable);
public void deleteById(Integer id);
public void deleteAll();
public List<CoursDto> findByTitreContains(String titre);
public List<CoursDto> findByDescriptionContains(String description);
public List<CoursDto> findByPrixCoursGreaterThan(float prix);
public List<CoursDto> findByPrixCoursLessThan(float prix);
public List<CoursDto> findByCategories(CategorieDto categorieDto);
public List<CoursDto> findByEnseignant(EnseignantDto enseignantDto);
public List<CoursDto> findByEvaluations(EvaluationDto evaluationDto);
	
}
