package com.projetStage.services.utilisateurs;

import java.util.List;
import com.projetStage.models.dto.utilisateurs.AdminDto;


public interface AdminService {
	
public void save(AdminDto adminDto);
public AdminDto findById(Integer id);
public List<AdminDto> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
