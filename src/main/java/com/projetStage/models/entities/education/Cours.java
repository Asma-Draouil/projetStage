package com.projetStage.models.entities.education;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.models.BaseEntity;
import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.entities.communication.Commentaire;
import com.projetStage.models.entities.communication.Evaluation;
import com.projetStage.models.entities.utilisateurs.Enseignant;
import com.projetStage.models.entities.utilisateurs.Etudiant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours extends BaseEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private String titre;

private String description,plan;


private int nombreHeure;

@Enumerated(EnumType.STRING)
private NiveauCours niveauCours;

private String prerequis;

private int nombreParticipants;


private float prixCours;

@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "EnseignantId")
private Enseignant enseignant;

@ManyToMany(mappedBy = "cours")
private Set<Categorie> categories = new HashSet<>();

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "certificatId")
private Certificat certificat;	

@OneToMany(mappedBy = "cours")
private List<Commentaire> commentaires = new ArrayList<>();


@OneToMany(mappedBy = "cours")
private Set<Chapitre> chapitres = new HashSet<>();

@OneToMany(mappedBy = "cours")
private List<Evaluation> evaluations = new ArrayList<>();

@ManyToMany(fetch = FetchType.LAZY,
cascade = {
		CascadeType.PERSIST,
		CascadeType.MERGE
}
		)
@JoinTable(
		name = "cours_etudiant",
		joinColumns = @JoinColumn(name = "coursId"),
		inverseJoinColumns = @JoinColumn(name = "etudiantId")
		)
private Set<Etudiant> etudiants = new HashSet<>();


}
