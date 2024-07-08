package com.projetStage.models.dto.utilisateurs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.communication.Evaluation;
import com.projetStage.models.entities.utilisateurs.Adresse;
import com.projetStage.models.entities.utilisateurs.enums.Roles;
import com.projetStage.models.entities.utilisateurs.enums.StatutConnexion;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	private String nom,prenom;
	
	@NotNull
	@NotEmpty
	private int age;

	@NotNull
	@NotEmpty
	@Size(min = 8)
	private String telephone;

	@NotNull
	@NotEmpty
	@Email
	private String email;

	@NotNull
	@NotEmpty
	@Size(min = 8)
	private String motDePasse;

	@Enumerated(EnumType.STRING)
	private StatutConnexion statutConnexion;

	@Enumerated(EnumType.STRING)
	private Roles roles;
	
	@JsonIgnoreProperties
	private Adresse adresse;
	
	@JsonIgnoreProperties
	private Evaluation evaluation;
}
