package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.education.ChapitreDto;


public interface ChapitreService {
	
public ChapitreDto save(ChapitreDto chapitreDto);
public Optional<ChapitreDto> findById(Integer id);
public List<ChapitreDto> findAll();
public void deleteById(Integer id);
public void deleteAll();	
	
	
}
