package com.projetStage.etudiant;

import java.util.HashSet;
import java.util.Set;

import com.projetStage.cours.Cours;
import com.projetStage.utilisateur.Utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
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
	
@Column(nullable = false, unique = true)	
private long infoCardCredit;
@Enumerated(EnumType.STRING)
private TypeEtudiant typeEtudiant;

@ManyToMany(mappedBy = "etudiants")
private Set<Cours> cours = new HashSet<>();

}
