package com.projetStage.models.dto.education;
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
public class DocumentDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	private String titre;
	
	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private String url;	
	
	@JsonIgnoreProperties
	private Chapitre chapitre;
}
