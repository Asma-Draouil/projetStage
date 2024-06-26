package com.projetStage.meeting;

import java.util.List;

public interface MeetingService {
public void save(Meeting meeting);
public Meeting findById(Integer id);
public List<Meeting> findAll();
public void deleteById(Integer id);
public void deletell();
}
