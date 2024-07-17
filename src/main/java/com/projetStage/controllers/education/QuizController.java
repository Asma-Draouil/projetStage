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

import com.projetStage.models.dto.education.QuizDto;
import com.projetStage.services.education.QuizService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/quizs")
@RequiredArgsConstructor
public class QuizController {

	private final QuizService quizService;
	
	@PostMapping
	public ResponseEntity<QuizDto> save(@RequestBody QuizDto quizDto){
		quizService.save(quizDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<QuizDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(quizService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<QuizDto>> findAll(){
		return ResponseEntity.ok(quizService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		quizService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
