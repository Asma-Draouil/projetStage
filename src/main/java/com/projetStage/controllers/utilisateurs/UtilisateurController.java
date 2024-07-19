package com.projetStage.controllers.utilisateurs;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetStage.models.dto.utilisateurs.AdresseDto;
import com.projetStage.models.dto.utilisateurs.UtilisateurDto;
import com.projetStage.services.utilisateurs.UtilisateurService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurController {
	
	private final UtilisateurService userService;
	
	@PostMapping
	public ResponseEntity<UtilisateurDto> save(@RequestBody UtilisateurDto userDto){
		userService.save(userDto);
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UtilisateurDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<UtilisateurDto>> findAll(){
		return ResponseEntity.ok(userService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		userService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	

	@PutMapping("/{id}/adresse")
	public ResponseEntity<UtilisateurDto> assignAdresseToUtilisateur(@PathVariable Integer id,@RequestBody AdresseDto adresseDto){
	
		return ResponseEntity.ok(userService.assignAdresseToUtilisateur(id, adresseDto));
	}
}
