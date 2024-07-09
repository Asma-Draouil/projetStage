package com.projetStage.models.mappers.communication;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.communication.CommentaireDto;
import com.projetStage.models.entities.communication.Commentaire;


public class CommentaireMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static CommentaireDto convertToDto(Commentaire commentaire) {
		
		return modelMapper.map(commentaire, CommentaireDto.class);
	}
	
	
	public static Commentaire convertToEntity(CommentaireDto commentaireDto) {
		
		return modelMapper.map(commentaireDto, Commentaire.class);
	}
}
