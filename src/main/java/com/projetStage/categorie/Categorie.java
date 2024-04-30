package com.projetStage.categorie;
import java.util.Set;

import com.projetStage.auditModel.AuditModel;
import com.projetStage.cours.Cours;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Categorie extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Column(nullable = false, unique = true)	
private String nomCategorie;	

@ManyToMany(mappedBy = "categories")
private Set<Cours> cours;


}
