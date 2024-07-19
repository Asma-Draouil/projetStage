package com.projetStage.models.dto.education;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
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
public class CategorieDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	private String titre;	

	@NotNull
	@NotEmpty
	private String description;
	
	@JsonIgnoreProperties("categories")
	private Set<Cours> cours = new HashSet<>();
}
