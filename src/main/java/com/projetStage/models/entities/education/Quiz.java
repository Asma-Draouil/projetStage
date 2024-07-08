package com.projetStage.models.entities.education;

import java.util.Date;

import com.projetStage.models.BaseEntity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz extends BaseEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
private String titre;

private String description;

private Date durée;

private int score;

private boolean estReussi;

}
