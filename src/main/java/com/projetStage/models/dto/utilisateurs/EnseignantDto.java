package com.projetStage.models.dto.utilisateurs;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.entities.education.Cours;

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

public class EnseignantDto extends UtilisateurDto{
	
	@NotNull
	@NotEmpty
	private String profession;

	@NotNull
	@NotEmpty
	private String specialite;

	private String description;

	private int experience;
	
	@JsonIgnoreProperties
	private Set<Cours> cours = new HashSet<>();
}
