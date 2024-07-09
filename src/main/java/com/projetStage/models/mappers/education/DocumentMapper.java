package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.DocumentDto;
import com.projetStage.models.entities.education.Document;


public class DocumentMapper {
	
	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static DocumentDto convertToDto(Document document) {
		
		return modelMapper.map(document, DocumentDto.class);
	}
	
	
	public static Document convertToEntity(DocumentDto documentDto) {
		
		return modelMapper.map(documentDto, Document.class);
	}
}
