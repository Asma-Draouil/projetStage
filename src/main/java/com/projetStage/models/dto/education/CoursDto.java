package com.projetStage.models.dto.education;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.entities.communication.Commentaire;
import com.projetStage.models.entities.communication.Evaluation;
import com.projetStage.models.entities.education.Categorie;
import com.projetStage.models.entities.education.Chapitre;
import com.projetStage.models.entities.education.NiveauCours;
import com.projetStage.models.entities.utilisateurs.Enseignant;
import com.projetStage.models.entities.utilisateurs.Etudiant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoursDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	private String titre;

	@NotNull
	@NotEmpty
	private String description,plan;

	@NotNull
	@NotEmpty
	private int nombreHeure;

	@Enumerated(EnumType.STRING)
	private NiveauCours niveauCours;

	@NotNull
	@NotEmpty
	private String prerequis;
	
	@NotNull
	@NotEmpty
	private int nombreParticipants;
	
	@NotNull
	@NotEmpty
	private float prixCours;
	
	@JsonIgnoreProperties
	private Enseignant enseignant;
	
	@JsonIgnoreProperties
	private Set<Categorie> categories = new HashSet<>();
	
	@JsonIgnoreProperties
	private Certificat certificat;	
	
	@JsonIgnoreProperties
	private List<Commentaire> commentaires = new ArrayList<>();
	
	@JsonIgnoreProperties
	private Set<Chapitre> chapitres = new HashSet<>();
	
	@JsonIgnoreProperties
	private List<Evaluation> evaluations = new ArrayList<>();
	
	@JsonIgnoreProperties
	private Set<Etudiant> etudiants = new HashSet<>();
	
	
}
