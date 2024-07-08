package com.projetStage.models.entities.education;
import java.util.HashSet;
import java.util.Set;

import com.projetStage.models.BaseEntity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Categorie extends BaseEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
private String titre;	

private String description;

@ManyToMany(
		fetch = FetchType.LAZY,
		cascade = {
				CascadeType.PERSIST,
				CascadeType.MERGE
		}
		)
@JoinTable(
		name = "categorie_cours",
		joinColumns = @JoinColumn(name = "categorieId"),
		inverseJoinColumns = @JoinColumn(name = "coursId")
		)
private Set<Cours> cours = new HashSet<>();


}
