package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.projetStage.models.dto.utilisateurs.EtudiantDto;
import com.projetStage.models.entities.utilisateurs.Etudiant;
import com.projetStage.models.mappers.utilisateurs.EtudiantMapper;
import com.projetStage.repositories.utilisateurs.EtudiantRepository;
import com.projetStage.services.utilisateurs.EtudiantService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
	
	private final EtudiantRepository etudiantRepository;

	@Override
	public EtudiantDto save(EtudiantDto etudiantDto) {
		Etudiant etudiant = EtudiantMapper.convertToEntity(etudiantDto);
		return EtudiantMapper.convertToDto(etudiantRepository.save(etudiant));
	}

	@Override
	public EtudiantDto findById(Integer id) {
	
		return etudiantRepository.findById(id).map(EtudiantMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun etudiant trouvé avec l'ID : " +id));
	}

	@Override
	public List<EtudiantDto> findAll() {
		
		return etudiantRepository.findAll()
				.stream()
				.map(EtudiantMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		etudiantRepository.deleteAll();
		
	}
	
	
	

}
