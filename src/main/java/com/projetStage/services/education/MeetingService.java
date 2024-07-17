package com.projetStage.services.education;

import java.util.List;
import com.projetStage.models.dto.education.MeetingDto;


public interface MeetingService {
	
public MeetingDto save(MeetingDto meetingDto);
public MeetingDto findById(Integer id);
public List<MeetingDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
