package com.projetStage.utilisateur;

import com.projetStage.adresse.Adresse;
import com.projetStage.auditModel.AuditModel;

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
	
@NotNull
private String nom,prenom;
@NotNull
private int age;
@NotNull
private String telephone;
@Column(unique = true)
@Email
private String email;
@NotEmpty
private String motDePasse;
private StatutConnexion statutConnexion;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "adresseId")
private Adresse adresse;

}
