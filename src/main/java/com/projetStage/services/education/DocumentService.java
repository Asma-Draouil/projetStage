package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Document;

public interface DocumentService {
public void save(Document document);
public Document findById(Integer id);
public List<Document> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
	
}
