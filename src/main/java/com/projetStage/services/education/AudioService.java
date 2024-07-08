package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Audio;

public interface AudioService {
public void save(Audio audio);
public Audio findById(Integer id);
public List<Audio> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
}
