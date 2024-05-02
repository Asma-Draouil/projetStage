package com.projetStage.certificat;

import com.projetStage.auditModel.AuditModel;
import com.projetStage.cours.Cours;


import jakarta.persistence.Entity;

import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Certificat extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@OneToOne(mappedBy = "certificat")
private Cours cours;
}
