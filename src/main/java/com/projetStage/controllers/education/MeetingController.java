package com.projetStage.controllers.education;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetStage.models.dto.education.MeetingDto;
import com.projetStage.services.education.MeetingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/meetings")
@RequiredArgsConstructor
public class MeetingController {

	private final MeetingService meetingService;
	
	@PostMapping
	public ResponseEntity<MeetingDto> save(@RequestBody MeetingDto meetingDto){
		meetingService.save(meetingDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MeetingDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(meetingService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<MeetingDto>> findAll(){
		return ResponseEntity.ok(meetingService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		meetingService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
