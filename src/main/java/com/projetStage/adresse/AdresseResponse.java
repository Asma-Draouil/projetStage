package com.projetStage.adresse;



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
public class AdresseResponse {
	
	private String adresse;
	
	private String codePostal;
	
	private String ville;
	
	private String region;
	
	private String pays;
}
