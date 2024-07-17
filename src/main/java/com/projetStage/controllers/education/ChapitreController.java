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
import com.projetStage.models.dto.education.ChapitreDto;
import com.projetStage.services.education.ChapitreService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/chapitres")
@RequiredArgsConstructor
public class ChapitreController {

	private final ChapitreService chapitreService;
	
	@PostMapping
	public ResponseEntity<ChapitreDto> save(@RequestBody ChapitreDto chapitreDto){
		chapitreService.save(chapitreDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ChapitreDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(chapitreService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<ChapitreDto>> findAll(){
		return ResponseEntity.ok(chapitreService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		chapitreService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
	

