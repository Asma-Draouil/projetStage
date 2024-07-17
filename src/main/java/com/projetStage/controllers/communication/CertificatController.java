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

import com.projetStage.models.dto.communication.CertificatDto;
import com.projetStage.services.communication.CertificatService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/certificats")
@RequiredArgsConstructor
public class CertificatController {

	private final CertificatService certificatService;
	
	@PostMapping
	public ResponseEntity<CertificatDto> save(@RequestBody CertificatDto certificatDto){
		certificatService.save(certificatDto);
		return ResponseEntity
				.accepted()
				.build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CertificatDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(certificatService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<CertificatDto>> findAll(){
		return ResponseEntity.ok(certificatService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		certificatService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
