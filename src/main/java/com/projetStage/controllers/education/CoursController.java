package com.projetStage.controllers.education;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetStage.models.dto.education.CoursDto;
import com.projetStage.services.education.CoursService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cours")
@RequiredArgsConstructor
public class CoursController {
	
	private final CoursService coursService;
	
	@PostMapping
	public ResponseEntity<CoursDto> save(@RequestBody CoursDto coursDto){
		coursService.save(coursDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CoursDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(coursService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<Page<CoursDto>> findAll(Pageable pageable){
		return ResponseEntity.ok(coursService.findAll(pageable));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		coursService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	

}
