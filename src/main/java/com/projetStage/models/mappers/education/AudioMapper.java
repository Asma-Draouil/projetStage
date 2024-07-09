package com.projetStage.models.mappers.education;

import org.modelmapper.ModelMapper;

import com.projetStage.models.dto.education.AudioDto;

import com.projetStage.models.entities.education.Audio;


public class AudioMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static AudioDto convertToDto(Audio audio) {
		
		return modelMapper.map(audio, AudioDto.class);
	}
	
	
	public static Audio convertToEntity(AudioDto audioDto) {
		
		return modelMapper.map(audioDto, Audio.class);
	}
}
