package com.projetStage.audio;

import java.util.List;

public interface AudioService {
public void save(Audio audio);
public Audio findById(Integer id);
public List<Audio> findAll();
public void deleteById(Integer id);
public void deleteAll();
	
}
