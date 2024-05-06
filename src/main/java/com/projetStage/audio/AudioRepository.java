package com.projetStage.audio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.admin.Admin;

public interface AudioRepository extends JpaRepository<Admin, Integer> {

}
