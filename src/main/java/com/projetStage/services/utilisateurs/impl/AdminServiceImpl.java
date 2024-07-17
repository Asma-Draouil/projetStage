package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.utilisateurs.AdminDto;
import com.projetStage.models.entities.utilisateurs.Admin;
import com.projetStage.models.mappers.utilisateurs.AdminMapper;
import com.projetStage.repositories.utilisateurs.AdminRepository;
import com.projetStage.services.utilisateurs.AdminService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
	
	private final AdminRepository adminRepository;

	@Override
	public AdminDto save(AdminDto adminDto) {
		Admin admin = AdminMapper.convertToEntity(adminDto);
		return AdminMapper.convertToDto(adminRepository.save(admin));
	}

	@Override
	public AdminDto findById(Integer id) {
		
		return adminRepository.findById(id).map(AdminMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun admin trouvé avec l'ID : " +id));
	}

	@Override
	public List<AdminDto> findAll() {
		
		return adminRepository.findAll()
				.stream()
				.map(AdminMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		adminRepository.deleteAll();
		
	}
	
	

}
