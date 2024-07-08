package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Video;

public interface VideoService {
public void save(Video video);
public Video findById(Integer id);
public List<Video> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
