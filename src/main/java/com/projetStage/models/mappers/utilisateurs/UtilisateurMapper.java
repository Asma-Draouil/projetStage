package com.projetStage.models.mappers.utilisateurs;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.utilisateurs.UtilisateurDto;
import com.projetStage.models.entities.utilisateurs.Utilisateur;

public class UtilisateurMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static UtilisateurDto convertToDto(Utilisateur utilisateur) {
		
		return modelMapper.map(utilisateur, UtilisateurDto.class);
	}
	
	
	public static Utilisateur convertToEntity(UtilisateurDto utilisateurDto) {
		
		return modelMapper.map(utilisateurDto, Utilisateur.class);
	}
}
