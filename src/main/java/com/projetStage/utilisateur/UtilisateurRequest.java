package com.projetStage.utilisateur;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class UtilisateurRequest {
	
	private Integer id;
	
	@NotNull
	@NotEmpty
	private String nom,prenom;

	@NotNull
	@NotEmpty
	private int age;

	@NotNull
	@NotEmpty
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

}
