package com.projetStage.categorie;

import com.projetStage.auditModel.AuditModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

}
