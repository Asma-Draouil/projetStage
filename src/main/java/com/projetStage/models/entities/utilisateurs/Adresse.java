package com.projetStage.models.entities.utilisateurs;

import com.projetStage.models.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Adresse extends BaseEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String adresse;
	private String codePostal;
	private String ville;
	private String region;
	private String pays;
	

@OneToOne(mappedBy = "adresse")
private Utilisateur utilisateur;
}
