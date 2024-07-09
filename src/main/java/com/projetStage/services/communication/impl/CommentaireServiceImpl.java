package com.projetStage.services.communication.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.communication.CommentaireDto;
import com.projetStage.models.entities.communication.Commentaire;
import com.projetStage.models.mappers.communication.CommentaireMapper;
import com.projetStage.repositories.communication.CommentaireRepository;
import com.projetStage.services.communication.CommentaireService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentaireServiceImpl implements CommentaireService{

	private final CommentaireRepository commentaireRepository;
	
	@Override
	public CommentaireDto save(CommentaireDto commentaireDto) {
	 Commentaire commentaire = CommentaireMapper.convertToEntity(commentaireDto);
	return CommentaireMapper.convertToDto(commentaireRepository.save(commentaire));
	}

	@Override
	public Optional<CommentaireDto> findById(Integer id) {
	
		return commentaireRepository.findById(id).map(CommentaireMapper::convertToDto);
	}

	@Override
	public List<CommentaireDto> findAll() {
		
		return commentaireRepository.findAll()
				.stream()
				.map(CommentaireMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		commentaireRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		commentaireRepository.deleteAll();
		
	}

}
