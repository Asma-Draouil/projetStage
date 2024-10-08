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
import com.projetStage.models.dto.education.CategorieDto;
import com.projetStage.services.education.CategorieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {

	private final CategorieService categorieService;
	
	@PostMapping
	public ResponseEntity<CategorieDto> save(@RequestBody CategorieDto categorieDto){
		categorieService.save(categorieDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategorieDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(categorieService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<CategorieDto>> findAll(){
		return ResponseEntity.ok(categorieService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		categorieService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
