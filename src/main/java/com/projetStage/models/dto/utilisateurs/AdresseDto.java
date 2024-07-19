package com.projetStage.models.dto.utilisateurs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.utilisateurs.Utilisateur;
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
public class AdresseDto extends BaseEntityDto {
	@NotNull
	@NotEmpty
	private String adresse;
	
	@NotNull
	@NotEmpty
	private String codePostal;
	
	@NotNull
	@NotEmpty
	private String ville;
	
	@NotNull
	@NotEmpty
	private String region;
	
	@NotNull
	@NotEmpty
	private String pays;
	
	@JsonIgnoreProperties("adresse")
	private Utilisateur utilisateur;
}
