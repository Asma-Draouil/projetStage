package com.projetStage.utilisateur;

import com.projetStage.adresse.Adresse;
import com.projetStage.auditModel.AuditModel;
import com.projetStage.evaluation.Evaluation;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "typeUtilisateur",discriminatorType = DiscriminatorType.STRING)
public abstract class Utilisateur extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

private String nom,prenom;

private int age;

private String telephone;

private String email;

private String motDePasse;

private StatutConnexion statutConnexion;

private Roles roles;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "adresseId")
private Adresse adresse;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "evaluationId")
private Evaluation evaluation;

}
