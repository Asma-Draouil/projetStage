package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.utilisateurs.EnseignantDto;
import com.projetStage.models.entities.utilisateurs.Enseignant;
import com.projetStage.models.mappers.utilisateurs.EnseignantMapper;
import com.projetStage.repositories.utilisateurs.EnseignantRepository;
import com.projetStage.services.utilisateurs.EnseignantService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnseignantServiceImpl implements EnseignantService{
	
	private final EnseignantRepository enseignantRepository;
	
	@Override
	public EnseignantDto save(EnseignantDto enseignantDto) {
	
		Enseignant enseignant = EnseignantMapper.convertToEntity(enseignantDto);
		return EnseignantMapper.convertToDto(enseignantRepository.save(enseignant));
	}

	@Override
	public EnseignantDto findById(Integer id) {
	
		return enseignantRepository.findById(id).map(EnseignantMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun enseignant trouvé avec l'ID : " +id));
	}

	@Override
	public List<EnseignantDto> findAll() {

		return enseignantRepository.findAll()
				.stream()
				.map(EnseignantMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		enseignantRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		enseignantRepository.deleteAll();
		
	}

}
