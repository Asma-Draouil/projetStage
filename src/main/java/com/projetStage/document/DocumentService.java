package com.projetStage.document;

import java.util.List;

public interface DocumentService {
public void save(Document document);
public Document findById(Integer id);
public List<Document> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
	
}
