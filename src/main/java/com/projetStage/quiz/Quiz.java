package com.projetStage.quiz;

import java.util.Date;

import com.projetStage.auditModel.AuditModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Quiz extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(nullable = false, unique = true)	
private String titreQuiz;
@NotNull
private Date durée;
private int score;
private boolean estReussi;

}
