package com.projetStage.services.education.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.ChapitreDto;
import com.projetStage.models.entities.education.Chapitre;
import com.projetStage.models.mappers.education.ChapitreMapper;
import com.projetStage.repositories.education.ChapitreRepository;
import com.projetStage.services.education.ChapitreService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChapitreServiceImpl implements ChapitreService {
	
	private final ChapitreRepository chapitreRepository;
	
	@Override
	public ChapitreDto save(ChapitreDto chapitreDto) {
		Chapitre chapitre = ChapitreMapper.convertToEntity(chapitreDto);
		return ChapitreMapper.convertToDto(chapitreRepository.save(chapitre));
	}

	@Override
	public Optional<ChapitreDto> findById(Integer id) {
		
		return chapitreRepository.findById(id).map(ChapitreMapper::convertToDto);
	}

	@Override
	public List<ChapitreDto> findAll() {

		return chapitreRepository.findAll()
				.stream()
				.map(ChapitreMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		chapitreRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
	chapitreRepository.deleteAll();
		
	}

}
