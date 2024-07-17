package com.projetStage.services.utilisateurs;

import java.util.List;
import com.projetStage.models.dto.utilisateurs.EtudiantDto;


public interface EtudiantService {
	
public EtudiantDto save(EtudiantDto etudiantDto);
public EtudiantDto findById(Integer id);
public List<EtudiantDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
