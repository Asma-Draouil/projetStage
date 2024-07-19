package com.projetStage.models.dto.communication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.education.Cours;
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
public class CommentaireDto extends BaseEntityDto{

	@NotNull
	@NotEmpty
	private String contenu;	
	
	@JsonIgnoreProperties("commentaires")
	private Cours cours;
	
	@JsonIgnoreProperties("commentaires")
	private Utilisateur utilisateur;
}
