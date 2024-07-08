package com.projetStage.repositories.utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}
