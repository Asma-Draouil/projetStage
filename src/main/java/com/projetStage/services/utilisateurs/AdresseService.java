package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.entities.utilisateurs.Adresse;

public interface AdresseService {
	public void save(Adresse adresse);
	public Adresse findById(Integer id);
	public List<Adresse> findAll();
	public void deleteById(Integer id);
	public void deleteAll();
	

}
