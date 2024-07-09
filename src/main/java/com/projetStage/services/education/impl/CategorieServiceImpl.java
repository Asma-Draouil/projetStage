package com.projetStage.services.education.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.entities.education.Categorie;
import com.projetStage.models.mappers.education.CategorieMapper;
import com.projetStage.repositories.education.CategorieRepository;
import com.projetStage.services.education.CategorieService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl implements CategorieService{

	private final CategorieRepository categorieRepository;

	@Override
	public CategorieDto save(CategorieDto categorieDto) {
		Categorie categorie = CategorieMapper.convertToEntity(categorieDto);
		return CategorieMapper.convertToDto(categorieRepository.save(categorie));
	}

	@Override
	public Optional<CategorieDto> findById(Integer id) {
		
		return categorieRepository.findById(id).map(CategorieMapper::convertToDto);
	}

	@Override
	public List<CategorieDto> findAll() {
		
		return categorieRepository.findAll()
				.stream()
				.map(CategorieMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		categorieRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		categorieRepository.deleteAll();
		
	}
}
