package com.projetStage.models.dto.education;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.education.Chapitre;

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
public class QuizDto extends BaseEntityDto {

	@NotNull
	@NotEmpty
	private String titre;

	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private Date durée;

	@NotNull
	@NotEmpty
	private int score;

	
	private boolean estReussi;
	
	@JsonIgnoreProperties("quiz")
	private Chapitre chapitre;
	
}
