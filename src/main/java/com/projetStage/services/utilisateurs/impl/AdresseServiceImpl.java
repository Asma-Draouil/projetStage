package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.utilisateurs.AdresseDto;
import com.projetStage.models.entities.utilisateurs.Adresse;
import com.projetStage.models.mappers.utilisateurs.AdresseMapper;
import com.projetStage.repositories.utilisateurs.AdresseRepository;
import com.projetStage.services.utilisateurs.AdresseService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdresseServiceImpl implements AdresseService{
	
	private final AdresseRepository adresseRepository;
	
	@Override
	public AdresseDto save(AdresseDto adresseDto) {
	Adresse adresse = AdresseMapper.convertToEntity(adresseDto);
		return AdresseMapper.convertToDto(adresseRepository.save(adresse));
	}

	@Override
	public AdresseDto findById(Integer id) {
		
		return adresseRepository.findById(id).map(AdresseMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucune adresse trouvée avec l'ID : " +id));
	}

	@Override
	public List<AdresseDto> findAll() {
		
		return adresseRepository.findAll()
				.stream()
				.map(AdresseMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		adresseRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		adresseRepository.deleteAll();
		
	}

}
