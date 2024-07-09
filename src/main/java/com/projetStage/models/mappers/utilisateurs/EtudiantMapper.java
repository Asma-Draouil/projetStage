package com.projetStage.models.mappers.utilisateurs;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.utilisateurs.EtudiantDto;
import com.projetStage.models.entities.utilisateurs.Etudiant;


public class EtudiantMapper {
	
	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	public static EtudiantDto convertToDto(Etudiant etudiant) {
		
		return modelMapper.map(etudiant, EtudiantDto.class);
	}
	
	
	public static Etudiant convertToEntity(EtudiantDto etudiantDto) {
		
		return modelMapper.map(etudiantDto, Etudiant.class);
	}
}
