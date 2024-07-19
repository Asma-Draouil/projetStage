package com.projetStage.models.entities.communication;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.models.entities.communication.enums.ModePaiement;
import com.projetStage.models.entities.communication.enums.TypePaiement;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Etudiant;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

@Enumerated(EnumType.STRING)
private TypePaiement typePaiement;

@Enumerated(EnumType.STRING)
private ModePaiement modePaiement;

@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "etudiantId")
private Etudiant etudiant;

@OneToOne(mappedBy = "paiement")
private Cours cours;

}
