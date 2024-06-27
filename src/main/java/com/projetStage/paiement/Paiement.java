package com.projetStage.paiement;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paiement {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@NotNull
private float montant;
@NotNull
private Date datePaiement;

private Date delai;

@Enumerated(EnumType.STRING)
private TypePaiement typePaiement;

@Enumerated(EnumType.STRING)
private ModePaiement modePaiement;

}
