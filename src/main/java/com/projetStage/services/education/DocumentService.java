package com.projetStage.services.education;

import java.util.List;
import com.projetStage.models.dto.education.DocumentDto;


public interface DocumentService {
public DocumentDto save(DocumentDto documentDto);
public DocumentDto findById(Integer id);
public List<DocumentDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
	
}
