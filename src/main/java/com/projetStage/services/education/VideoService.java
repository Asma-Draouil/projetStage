package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.dto.education.VideoDto;


public interface VideoService {
public void save(VideoDto videoDto);
public VideoDto findById(Integer id);
public List<VideoDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
