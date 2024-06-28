package com.projetStage.paiement;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

private float montant;

private Date datePaiement;

private Date delai;


private TypePaiement typePaiement;


private ModePaiement modePaiement;

}
