package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.MeetingDto;
import com.projetStage.models.entities.education.Meeting;



public class MeetingMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static MeetingDto convertToDto(Meeting meeting) {
		
		return modelMapper.map(meeting, MeetingDto.class);
	}
	
	
	public static Meeting convertToEntity(MeetingDto meetingDto) {
		
		return modelMapper.map(meetingDto, Meeting.class);
	}
}
