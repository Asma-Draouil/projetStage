package com.projetStage.repositories.education;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.education.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
