package com.projetStage.models.mappers.communication;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.communication.CertificatDto;
import com.projetStage.models.entities.communication.Certificat;


public class CertificatMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static CertificatDto convertToDto(Certificat certificat) {
		
		return modelMapper.map(certificat, CertificatDto.class);
	}
	
	
	public static Certificat convertToEntity(CertificatDto certificatDto) {
		
		return modelMapper.map(certificatDto, Certificat.class);
	}
}
