package com.projetStage.models.entities.communication;

import java.util.Date;

import com.projetStage.models.entities.communication.enums.ModePaiement;
import com.projetStage.models.entities.communication.enums.TypePaiement;

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
