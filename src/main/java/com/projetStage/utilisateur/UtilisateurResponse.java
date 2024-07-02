package com.projetStage.utilisateur;




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
public class UtilisateurResponse {
	
	private String nom,prenom;

	private int age;

	private String telephone;

	private String email;

	private String motDePasse;

	private StatutConnexion statutConnexion;

	private Roles roles;
}
