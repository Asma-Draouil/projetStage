package com.projetStage.services.education.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.models.dto.utilisateurs.EnseignantDto;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.mappers.education.CoursMapper;
import com.projetStage.repositories.education.CoursRepository;
import com.projetStage.services.education.CoursService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoursServiceImpl implements CoursService{
	
	private final CoursRepository coursRepository;
	
	@Override
	public CoursDto save(CoursDto coursDto) {
		Cours cours = CoursMapper.convertToEntity(coursDto);
		return CoursMapper.convertToDto(coursRepository.save(cours));
	}

	@Override
	public Optional<CoursDto> findById(Integer id) {
	
		return coursRepository.findById(id).map(CoursMapper::convertToDto);
	}

	@Override
	public Page<CoursDto> findAll(Pageable pageable) {
	
		Page<Cours> cours = coursRepository.findAll(pageable);
		return cours.map(CoursMapper::convertToDto);
	}

	@Override
	public void deleteById(Integer id) {
		coursRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		coursRepository.deleteAll();
		
	}

	@Override
	public Optional<List<CoursDto>> findByTitreContains(String titre) {
		
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByDescriptionContains(String description) {
		
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByPrixCoursGreaterThan(float prix) {
		
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByPrixCoursLessThan(float prix) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByCategories(CategorieDto categorieDto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByEnseignant(EnseignantDto enseignantDto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<CoursDto>> findByEvaluations(EvaluationDto evaluationDto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
