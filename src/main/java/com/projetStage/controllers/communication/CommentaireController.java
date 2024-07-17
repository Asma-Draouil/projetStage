package com.projetStage.controllers.communication;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetStage.models.dto.communication.CommentaireDto;
import com.projetStage.services.communication.CommentaireService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/commentaires")
@RequiredArgsConstructor
public class CommentaireController {

	private final CommentaireService commentaireService;
	
	
	@PostMapping
	public ResponseEntity<CommentaireDto> save(@RequestBody CommentaireDto commentaireDto){
		commentaireService.save(commentaireDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CommentaireDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(commentaireService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<CommentaireDto>> findAll(){
		return ResponseEntity.ok(commentaireService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		commentaireService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
