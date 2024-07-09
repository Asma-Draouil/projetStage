package com.projetStage.services.utilisateurs;

import java.util.List;
import com.projetStage.models.dto.utilisateurs.AdresseDto;


public interface AdresseService {
	
	public void save(AdresseDto adresseDto);
	public AdresseDto findById(Integer id);
	public List<AdresseDto> findAll();
	public void deleteById(Integer id);
	public void deleteAll();
	

}
