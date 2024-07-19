package com.projetStage.controllers.utilisateurs;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetStage.models.dto.utilisateurs.EnseignantDto;
import com.projetStage.services.utilisateurs.EnseignantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/enseignants")
@RequiredArgsConstructor
public class EnseignantController {

	private final EnseignantService enseignantService;
	
	@PostMapping
	public ResponseEntity<EnseignantDto> save(@RequestBody EnseignantDto enseignantDto){
		enseignantService.save(enseignantDto);
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EnseignantDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(enseignantService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<EnseignantDto>> findAll(){
		return ResponseEntity.ok(enseignantService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		enseignantService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
