package com.projetStage.services.education.impl;


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

import jakarta.persistence.EntityNotFoundException;
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
	public CoursDto findById(Integer id) {
	
		return coursRepository.findById(id).map(CoursMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun cours trouvé avec l'ID : " +id));
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
	public Page<CoursDto> findByTitreContains(String titre, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByDescriptionContains(String description, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByPrixCoursGreaterThan(float prix, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByPrixCoursLessThan(float prix, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByCategories(CategorieDto categorieDto, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByEnseignant(EnseignantDto enseignantDto, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CoursDto> findByEvaluations(EvaluationDto evaluationDto, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



}
