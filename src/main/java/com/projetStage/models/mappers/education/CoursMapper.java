package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.entities.education.Cours;

public class CoursMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static CoursDto convertToDto(Cours cours) {
		
		return modelMapper.map(cours, CoursDto.class);
	}
	
	
	public static Cours convertToEntity(CoursDto coursDto) {
		
		return modelMapper.map(coursDto, Cours.class);
	}
}
