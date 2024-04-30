package com.projetStage.message;

import com.projetStage.auditModel.AuditModel;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@NotEmpty
private String contenuMessage;	
	

}
