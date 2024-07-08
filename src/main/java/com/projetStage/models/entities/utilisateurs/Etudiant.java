package com.projetStage.models.entities.utilisateurs;

import java.util.HashSet;
import java.util.Set;

import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.enums.TypeEtudiant;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant extends Utilisateur {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

@Enumerated(EnumType.STRING)
private TypeEtudiant typeEtudiant;

private String universite, niveauScolaire;

private String societe, experience;

private String profession, domaine;


@ManyToMany(mappedBy = "etudiants")
private Set<Cours> cours = new HashSet<>();

@OneToMany(mappedBy = "etudiant")
private Set<Certificat> certificats = new HashSet<>();
}
