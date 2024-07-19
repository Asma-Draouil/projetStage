package com.projetStage.models.entities.utilisateurs;


import java.util.ArrayList;
import java.util.List;

import com.projetStage.models.BaseEntity;
import com.projetStage.models.entities.communication.Commentaire;
import com.projetStage.models.entities.communication.Evaluation;
import com.projetStage.models.entities.utilisateurs.enums.Roles;
import com.projetStage.models.entities.utilisateurs.enums.StatutConnexion;

import jakarta.persistence.CascadeType;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "typeUtilisateur",discriminatorType = DiscriminatorType.STRING)
public abstract class Utilisateur extends BaseEntity {/**
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

@OneToMany(mappedBy = "utilisateur")
private List<Evaluation> evaluations;

@OneToMany(mappedBy = "utilisateur")
List<Commentaire> commentaires = new ArrayList<>() ;


}
