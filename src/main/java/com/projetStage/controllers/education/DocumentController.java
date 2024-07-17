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

import com.projetStage.models.dto.education.DocumentDto;
import com.projetStage.services.education.DocumentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/documents")
@RequiredArgsConstructor
public class DocumentController {

	private final DocumentService documentService;
	
	@PostMapping
	public ResponseEntity<DocumentDto> save(@RequestBody DocumentDto documentDto){
		documentService.save(documentDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DocumentDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(documentService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<DocumentDto>> findAll(){
		return ResponseEntity.ok(documentService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		documentService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
