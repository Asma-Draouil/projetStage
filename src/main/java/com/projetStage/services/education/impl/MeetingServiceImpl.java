package com.projetStage.services.education.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.education.MeetingDto;
import com.projetStage.models.entities.education.Meeting;
import com.projetStage.models.mappers.education.MeetingMapper;
import com.projetStage.repositories.education.MeetingRepository;
import com.projetStage.services.education.MeetingService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MeetingServiceImpl implements MeetingService {
	
	private final MeetingRepository meetingRepository;
	
	@Override
	public MeetingDto save(MeetingDto meetingDto) {
		Meeting meeting = MeetingMapper.convertToEntity(meetingDto);
		return MeetingMapper.convertToDto(meetingRepository.save(meeting));
	}

	@Override
	public MeetingDto findById(Integer id) {
	
		return meetingRepository.findById(id).map(MeetingMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun meeting trouvé avec l'ID : " +id));
	}

	@Override
	public List<MeetingDto> findAll() {

		return meetingRepository.findAll()
				.stream()
				.map(MeetingMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		meetingRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		meetingRepository.deleteAll();
	}

}
