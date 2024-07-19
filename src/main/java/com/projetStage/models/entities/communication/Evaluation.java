package com.projetStage.models.entities.communication;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.models.BaseEntity;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Utilisateur;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evaluation extends BaseEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

private float note;

private String remarque;

@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "coursId")
private Cours cours;	

@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "utilisateurId")
private Utilisateur utilisateur;

}
