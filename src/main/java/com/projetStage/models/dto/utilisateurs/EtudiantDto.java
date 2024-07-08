package com.projetStage.models.dto.utilisateurs;


import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.enums.TypeEtudiant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EtudiantDto extends UtilisateurDto{
	
	@Enumerated(EnumType.STRING)
	private TypeEtudiant typeEtudiant;

	private String universite, niveauScolaire;

	private String societe, experience;

	private String profession, domaine;
	
	@JsonIgnoreProperties
	private Set<Cours> cours = new HashSet<>();
	
	@JsonIgnoreProperties
	private Set<Certificat> certificats = new HashSet<>();
}
