package com.projetStage.etudiant;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EtudiantResponse {
	
	private TypeEtudiant typeEtudiant;

	private String universite, niveauScolaire;

	private String societe, experience;

	private String profession, domaine;
}
