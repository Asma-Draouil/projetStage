package com.projetStage.repositories.utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.utilisateurs.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
