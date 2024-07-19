package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.dto.utilisateurs.EnseignantDto;


public interface EnseignantService {
public EnseignantDto save(EnseignantDto enseignantDto);
public EnseignantDto findById(Integer id);
public List<EnseignantDto> findAll();
public void deleteById(Integer id);
public void deleteAll();	
public EnseignantDto assignCoursToEnseignant(Integer idEnseignant, CoursDto coursDto);
	
}
