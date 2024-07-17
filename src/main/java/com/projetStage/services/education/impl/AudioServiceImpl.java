package com.projetStage.services.education.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.AudioDto;
import com.projetStage.models.entities.education.Audio;
import com.projetStage.models.mappers.education.AudioMapper;
import com.projetStage.repositories.education.AudioRepository;
import com.projetStage.services.education.AudioService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AudioServiceImpl implements AudioService{
	
	private final AudioRepository audioRepository;
	
	@Override
	public AudioDto save(AudioDto audioDto) {
	
		Audio audio = AudioMapper.convertToEntity(audioDto);
		return AudioMapper.convertToDto(audioRepository.save(audio));
	}

	@Override
	public AudioDto findById(Integer id) {
		
		return audioRepository.findById(id).map(AudioMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun audio trouvé avec l'ID : " +id));
	}

	@Override
	public List<AudioDto> findAll() {
		
		return audioRepository.findAll()
				.stream()
				.map(AudioMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		audioRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		audioRepository.deleteAll();
		
	}

}
