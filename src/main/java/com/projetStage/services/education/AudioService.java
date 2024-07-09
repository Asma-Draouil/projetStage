package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.education.AudioDto;

public interface AudioService {
	
public AudioDto save(AudioDto audioDto);
public Optional<AudioDto> findById(Integer id);
public List<AudioDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
}
