package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.entities.utilisateurs.Admin;

public interface AdminService {
public void save(Admin admin);
public Admin findById(Integer id);
public List<Admin> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
