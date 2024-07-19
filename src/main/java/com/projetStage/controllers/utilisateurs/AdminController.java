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
import com.projetStage.models.dto.utilisateurs.AdminDto;
import com.projetStage.services.utilisateurs.AdminService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admins")
@RequiredArgsConstructor
public class AdminController {

	private final AdminService adminService;
	
	@PostMapping
	public ResponseEntity<AdminDto> save(@RequestBody AdminDto adminDto){
		adminService.save(adminDto);
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AdminDto> findById(@PathVariable Integer id){
		return ResponseEntity.ok(adminService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<AdminDto>> findAll(){
		return ResponseEntity.ok(adminService.findAll());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id){
		adminService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
