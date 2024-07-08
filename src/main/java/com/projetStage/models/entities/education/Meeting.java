package com.projetStage.models.entities.education;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.models.BaseEntity;

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
public class Meeting extends BaseEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
private String titre;

private String description;

private Date dateDebut, dateFin;

@ManyToOne(fetch = FetchType.LAZY)	
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "chapitreId")
private Chapitre chapitre;


}
