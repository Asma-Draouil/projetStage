package com.projetStage.repositories.education;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Admin;

public interface AudioRepository extends JpaRepository<Admin, Integer> {

}
