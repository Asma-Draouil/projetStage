package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.dto.education.CategorieDto;


public interface CategorieService {
	
public CategorieDto save(CategorieDto categorieDto);
public CategorieDto findById(Integer id);
public List<CategorieDto> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
