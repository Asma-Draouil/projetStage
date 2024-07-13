package com.projetStage.services.education.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.DocumentDto;
import com.projetStage.models.entities.education.Document;
import com.projetStage.models.mappers.education.DocumentMapper;
import com.projetStage.repositories.education.DocumentRepository;
import com.projetStage.services.education.DocumentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {
	
	private final DocumentRepository documentRepository;

	@Override
	public DocumentDto save(DocumentDto documentDto) {
		Document document=DocumentMapper.convertToEntity(documentDto);
		return DocumentMapper.convertToDto(documentRepository.save(document));
	}

	@Override
	public Optional<DocumentDto> findById(Integer id) {
		
		return documentRepository.findById(id).map(DocumentMapper::convertToDto);
	}

	@Override
	public List<DocumentDto> findAll() {
		
		return documentRepository.findAll()
				.stream()
				.map(DocumentMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		documentRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		documentRepository.deleteAll();
		
	}
	
	

}
