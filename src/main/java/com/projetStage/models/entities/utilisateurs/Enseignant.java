package com.projetStage.models.entities.utilisateurs;



import java.util.HashSet;
import java.util.Set;

import com.projetStage.models.entities.education.Cours;

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
	

private String profession;


private String specialite;

private String description;

private int experience;

@OneToMany(mappedBy = "enseignant")
private Set<Cours> cours = new HashSet<>();
}
