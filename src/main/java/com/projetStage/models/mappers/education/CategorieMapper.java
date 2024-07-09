package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.entities.education.Categorie;


public class CategorieMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static CategorieDto convertToDto(Categorie categorie) {
		
		return modelMapper.map(categorie, CategorieDto.class);
	}
	
	
	public static Categorie convertToEntity(CategorieDto categorieDto) {
		
		return modelMapper.map(categorieDto, Categorie.class);
	}
}
