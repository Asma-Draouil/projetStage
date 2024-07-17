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
import com.projetStage.models.dto.education.VideoDto;
import com.projetStage.services.education.VideoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/videos")
@RequiredArgsConstructor
public class VideoController {
	
	private final VideoService videoService;
	
	@PostMapping
	public ResponseEntity<VideoService> save(@RequestBody VideoDto videoDto){
		videoService.save(videoDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VideoDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(videoService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<VideoDto>> findAll(){
		return ResponseEntity.ok(videoService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		videoService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
