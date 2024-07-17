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

import com.projetStage.models.dto.communication.EvaluationDto;
import com.projetStage.services.communication.EvaluationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/evaluations")
@RequiredArgsConstructor
public class EvaluationController {

	private final EvaluationService evaluationService;
	
	
	@PostMapping
	public ResponseEntity<EvaluationDto> save(@RequestBody EvaluationDto evaluationDto){
		evaluationService.save(evaluationDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EvaluationDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(evaluationService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<EvaluationDto>> findAll(){
		return ResponseEntity.ok(evaluationService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		evaluationService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
