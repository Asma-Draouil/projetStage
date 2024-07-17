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
import com.projetStage.models.dto.communication.PaiementDto;
import com.projetStage.services.communication.PaiementService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/paiements")
@RequiredArgsConstructor
public class PaiementController {

	
	private final PaiementService paiementService;
	
	@PostMapping
	public ResponseEntity<PaiementDto> save(@RequestBody PaiementDto paiementDto){
		paiementService.save(paiementDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PaiementDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(paiementService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<PaiementDto>> findAll(){
		return ResponseEntity.ok(paiementService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		paiementService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
