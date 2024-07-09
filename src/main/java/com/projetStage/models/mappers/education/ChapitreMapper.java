package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.ChapitreDto;
import com.projetStage.models.entities.education.Chapitre;

public class ChapitreMapper {
 
	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static ChapitreDto convertToDto(Chapitre chapitre) {
		
		return modelMapper.map(chapitre, ChapitreDto.class);
	}
	
	
	public static Chapitre convertToEntity(ChapitreDto chapitreDto) {
		
		return modelMapper.map(chapitreDto, Chapitre.class);
	}
}
