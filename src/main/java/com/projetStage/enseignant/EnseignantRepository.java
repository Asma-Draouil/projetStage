package com.projetStage.enseignant;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
public Optional<List<Enseignant>> findByNomOrPrenom(String nom, String prenom);
public Optional<Enseignant> findByEmail(String email);



}
