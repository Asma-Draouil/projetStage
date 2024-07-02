package com.projetStage.adresse;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class AdresseRequest {
	
	private Integer id;
	
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
}
