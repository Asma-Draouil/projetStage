package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.VideoDto;
import com.projetStage.models.entities.education.Video;

public class VideoMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static VideoDto convertToDto(Video video) {
		
		return modelMapper.map(video, VideoDto.class);
	}
	
	
	public static Video convertToEntity(VideoDto videoDto) {
		
		return modelMapper.map(videoDto, Video.class);
	}
}
