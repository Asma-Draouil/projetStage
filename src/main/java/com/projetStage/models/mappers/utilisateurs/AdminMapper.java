package com.projetStage.models.mappers.utilisateurs;

import org.modelmapper.ModelMapper;
import com.projetStage.models.dto.utilisateurs.AdminDto;
import com.projetStage.models.entities.utilisateurs.Admin;

public class AdminMapper {

	private static final ModelMapper modelMapper = new ModelMapper();
	
	
	
	public static AdminDto convertToDto(Admin admin) {
		
		return modelMapper.map(admin, AdminDto.class);
	}
	
	
	public static Admin convertToEntity(AdminDto adminDto) {
		
		return modelMapper.map(adminDto, Admin.class);
	}
}
