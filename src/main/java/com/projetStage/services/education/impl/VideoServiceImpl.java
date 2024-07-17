package com.projetStage.services.education.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.VideoDto;
import com.projetStage.models.entities.education.Video;
import com.projetStage.models.mappers.education.VideoMapper;
import com.projetStage.repositories.education.VideoRepository;
import com.projetStage.services.education.VideoService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {
	
	private final VideoRepository videoRepository;
	
	@Override
	public VideoDto save(VideoDto videoDto) {
		Video video = VideoMapper.convertToEntity(videoDto);
		return VideoMapper.convertToDto(videoRepository.save(video));
	}

	@Override
	public VideoDto findById(Integer id) {
		
		return videoRepository.findById(id).map(VideoMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun vidéo trouvé avec l'ID : " +id));
	}

	@Override
	public List<VideoDto> findAll() {
		
		return videoRepository.findAll()
				.stream()
				.map(VideoMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		videoRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		videoRepository.deleteAll();
		
	}

}
