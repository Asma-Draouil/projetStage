package com.projetStage.services.utilisateurs;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.utilisateurs.AdresseDto;


public interface AdresseService {
	
	public AdresseDto save(AdresseDto adresseDto);
	public Optional<AdresseDto> findById(Integer id);
	public List<AdresseDto> findAll();
	public void deleteById(Integer id);
	public void deleteAll();
	

}
