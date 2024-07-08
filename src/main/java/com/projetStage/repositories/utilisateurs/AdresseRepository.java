package com.projetStage.repositories.utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

}
