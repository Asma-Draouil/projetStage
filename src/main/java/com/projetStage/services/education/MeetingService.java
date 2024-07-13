package com.projetStage.services.education;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.education.MeetingDto;


public interface MeetingService {
	
public MeetingDto save(MeetingDto meetingDto);
public Optional<MeetingDto> findById(Integer id);
public List<MeetingDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
