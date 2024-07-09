package com.projetStage.models.mappers.utilisateurs;

import org.modelmapper.ModelMapper;
import com.projetStage.models.dto.utilisateurs.AdresseDto;
import com.projetStage.models.entities.utilisateurs.Adresse;


public class AdresseMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static AdresseDto convertToDto(Adresse adresse) {
		
		return modelMapper.map(adresse, AdresseDto.class);
	}
	
	
	public static Adresse convertToEntity(AdresseDto adresseDto) {
		
		return modelMapper.map(adresseDto, Adresse.class);
	}
}
