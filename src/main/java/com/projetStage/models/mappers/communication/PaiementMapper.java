package com.projetStage.models.mappers.communication;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.communication.PaiementDto;
import com.projetStage.models.entities.communication.Paiement;


public class PaiementMapper {
	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static PaiementDto convertToDto(Paiement paiement) {
		
		return modelMapper.map(paiement, PaiementDto.class);
	}
	
	
	public static Paiement convertToEntity(PaiementDto paiementDto) {
		
		return modelMapper.map(paiementDto, Paiement.class);
	}
}

