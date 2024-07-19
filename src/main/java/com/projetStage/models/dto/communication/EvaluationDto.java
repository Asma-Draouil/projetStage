package com.projetStage.models.dto.communication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Utilisateur;

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
public class EvaluationDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	@Size(min = 1, max = 5)
	private float note;

	private String remarque;
	
	@JsonIgnoreProperties("evaluations")
	private Cours cours;
	
	@JsonIgnoreProperties("evaluation")
	private Utilisateur utilisateur;
}
