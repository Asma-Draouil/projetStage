package com.projetStage.services.education;

import java.util.List;

import com.projetStage.models.entities.education.Meeting;

public interface MeetingService {
public void save(Meeting meeting);
public Meeting findById(Integer id);
public List<Meeting> findAll();
public void deleteById(Integer id);
public void deletell();
}
