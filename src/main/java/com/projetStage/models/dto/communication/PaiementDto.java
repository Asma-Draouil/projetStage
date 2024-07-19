package com.projetStage.models.dto.communication;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.entities.communication.enums.ModePaiement;
import com.projetStage.models.entities.communication.enums.TypePaiement;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Etudiant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class PaiementDto {

	private Integer id;

	@NotNull
	@NotEmpty
	private float montant;

	@NotNull
	@NotEmpty
	private Date datePaiement;

	@NotNull
	@NotEmpty
	private Date delai;

	@Enumerated(EnumType.STRING)
	private TypePaiement typePaiement;

	@Enumerated(EnumType.STRING)
	private ModePaiement modePaiement;

	@JsonIgnoreProperties("paiements")
	private Etudiant etudiant;
	
	@JsonIgnoreProperties("paiement")
	private Cours cours;
}
