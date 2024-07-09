package com.projetStage.services.education;

import java.util.List;
import com.projetStage.models.dto.education.ChapitreDto;


public interface ChapitreService {
	
public void save(ChapitreDto chapitreDto);
public ChapitreDto findById(Integer id);
public List<ChapitreDto> findAll();
public void deleteById(Integer id);
public void deleteAll();	
	
	
}
