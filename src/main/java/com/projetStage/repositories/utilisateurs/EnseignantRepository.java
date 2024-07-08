package com.projetStage.repositories.utilisateurs;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
public Optional<List<Enseignant>> findByNomOrPrenom(String nom, String prenom);
public Optional<Enseignant> findByEmail(String email);



}
