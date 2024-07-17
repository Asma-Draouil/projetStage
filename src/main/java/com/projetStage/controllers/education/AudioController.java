package com.projetStage.controllers.education;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetStage.models.dto.education.AudioDto;
import com.projetStage.services.education.AudioService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/audios")
@RequiredArgsConstructor
public class AudioController {

	private final AudioService audioService;
	
	@PostMapping
	public ResponseEntity<AudioDto> save(@RequestBody AudioDto audioDto){
		audioService.save(audioDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AudioDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(audioService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<AudioDto>> findAll(){
		return ResponseEntity.ok(audioService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		audioService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
