package com.projetStage.repositories.utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
