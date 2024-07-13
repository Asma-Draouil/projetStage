package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.education.VideoDto;


public interface VideoService {
public VideoDto save(VideoDto videoDto);
public Optional<VideoDto> findById(Integer id);
public List<VideoDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
