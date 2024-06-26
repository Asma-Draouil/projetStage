package com.projetStage.etudiant;

import java.util.List;

public interface EtudiantService {
public void save(Etudiant etudiant);
public Etudiant findById(Integer id);
public List<Etudiant> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
	
}
