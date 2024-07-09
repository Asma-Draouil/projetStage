package com.projetStage.services.communication.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.communication.CertificatDto;
import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.mappers.communication.CertificatMapper;
import com.projetStage.repositories.communication.CertificatRepository;
import com.projetStage.services.communication.CertificatService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CertificatServiceImpl implements CertificatService {

	private final CertificatRepository certifRepository;
	
	@Override
	public CertificatDto save(CertificatDto certifdto) {
		Certificat certif = CertificatMapper.convertToEntity(certifdto);
		return CertificatMapper.convertToDto(certifRepository.save(certif));
	}

	@Override
	public Optional<CertificatDto> findById(Integer id) {
		
		return certifRepository.findById(id).map(CertificatMapper::convertToDto);
	}

	@Override
	public List<CertificatDto> findAll() {
		
		return certifRepository.findAll()
				.stream()
				.map(CertificatMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		certifRepository.deleteById(id);
		
	}


}
