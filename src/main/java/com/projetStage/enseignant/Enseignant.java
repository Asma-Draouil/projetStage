package com.projetStage.enseignant;



import java.util.HashSet;
import java.util.Set;

import com.projetStage.cours.Cours;
import com.projetStage.utilisateur.Utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Enseignant extends Utilisateur {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Column(nullable = false)
private String profession;

@Column(nullable = false)
private String specialite;

private String description;

private int experience;

@OneToMany(mappedBy = "enseignant")
private Set<Cours> cours = new HashSet<>();
}
