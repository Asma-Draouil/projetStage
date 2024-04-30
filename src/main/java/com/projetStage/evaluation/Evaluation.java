package com.projetStage.evaluation;

import com.projetStage.auditModel.AuditModel;

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
public class Evaluation extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String contenuEvaluation;	
	
	

}
