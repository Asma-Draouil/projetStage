package com.projetStage.admin;

import java.util.List;

public interface AdminService {
public void save(Admin admin);
public Admin findById(Integer id);
public List<Admin> findAll();
public void deleteById(Integer id);
public void deleteAll();

}
