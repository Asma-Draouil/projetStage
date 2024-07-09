package com.projetStage.models.mappers.utilisateurs;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.utilisateurs.EnseignantDto;
import com.projetStage.models.entities.utilisateurs.Enseignant;


public class EnseignantMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static EnseignantDto convertToDto(Enseignant enseignant) {
		
		return modelMapper.map(enseignant, EnseignantDto.class);
	}
	
	
	public static Enseignant convertToEntity(EnseignantDto enseignantDto) {
		
		return modelMapper.map(enseignantDto, Enseignant.class);
	}
}
