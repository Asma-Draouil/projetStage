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
import com.projetStage.models.dto.utilisateurs.EtudiantDto;
import com.projetStage.services.utilisateurs.EtudiantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/etudiants")
@RequiredArgsConstructor
public class EtudiantController {

	private final EtudiantService etudiantService;
	
	@PostMapping
	public ResponseEntity<EtudiantDto> save(@RequestBody EtudiantDto etudiantDto){
		etudiantService.save(etudiantDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EtudiantDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(etudiantService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<EtudiantDto>> findAll(){
		return ResponseEntity.ok(etudiantService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<EtudiantDto> deleteById(@PathVariable Integer id){
		etudiantService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
