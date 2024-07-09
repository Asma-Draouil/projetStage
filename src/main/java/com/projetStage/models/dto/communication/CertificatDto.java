package com.projetStage.models.dto.communication;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Etudiant;
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
public class CertificatDto {
	
	private Integer id;
	
	@NotNull
	@NotEmpty
	private String titre;

	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private Date datOptention;
	
	@JsonIgnoreProperties
	private Cours cours;
	
	@JsonIgnoreProperties
	private Etudiant etudiant;
}
