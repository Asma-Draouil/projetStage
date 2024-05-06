package com.projetStage.commentaire;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {

Page<Commentaire>findByCoursId(Integer coursId, Pageable page);
	
}
