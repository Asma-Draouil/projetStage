package com.projetStage.video;

import java.util.List;

public interface VideoService {
public void save(Video video);
public Video findById(Integer id);
public List<Video> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
