package com.projetStage.services.education;

import java.util.List;
import com.projetStage.models.dto.education.AudioDto;

public interface AudioService {
	
public AudioDto save(AudioDto audioDto);
public AudioDto findById(Integer id);
public List<AudioDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
}
