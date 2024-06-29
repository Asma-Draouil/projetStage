package com.projetStage.adresse;

import java.util.List;

public interface AdresseService {
	public void save(Adresse adresse);
	public Adresse findById(Integer id);
	public List<Adresse> findAll();
	public void deleteById(Integer id);
	public void deleteAll();
	

}
