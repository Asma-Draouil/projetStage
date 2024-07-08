package com.projetStage.repositories.communication;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.communication.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {

Page<Commentaire>findByCoursId(Integer coursId, Pageable page);
	
}
