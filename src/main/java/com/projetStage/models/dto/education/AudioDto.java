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
public class AudioDto extends BaseEntityDto {

	@NotNull
	@NotEmpty
	private String titre;

	@NotNull
	@NotEmpty
	private Date duree;

	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private String url;
	
	@JsonIgnoreProperties("audios")
	private Chapitre chapitre;
}
