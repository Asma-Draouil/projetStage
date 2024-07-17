package com.projetStage.services.communication.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.communication.PaiementDto;
import com.projetStage.models.entities.communication.Paiement;
import com.projetStage.models.mappers.communication.PaiementMapper;
import com.projetStage.repositories.communication.PaiementRepository;
import com.projetStage.services.communication.PaiementService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements PaiementService{

	private final PaiementRepository paiementRepository;
	
	@Override
	public PaiementDto save(PaiementDto paimentDto) {
		Paiement paiement = PaiementMapper.convertToEntity(paimentDto);
		return PaiementMapper.convertToDto(paiementRepository.save(paiement));
		
	}

	@Override
	public PaiementDto findById(Integer id) {
		
		return paiementRepository.findById(id).map(PaiementMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun paiement trouvé avec l'ID : " +id));
	}

	@Override
	public List<PaiementDto> findAll() {
		
		return paiementRepository.findAll()
				.stream()
				.map(PaiementMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		paiementRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
	paiementRepository.deleteAll();
		
	}

}
