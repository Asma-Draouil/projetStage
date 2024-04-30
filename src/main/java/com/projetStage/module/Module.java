package com.projetStage.module;

import com.projetStage.auditModel.AuditModel;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
public class Module extends AuditModel {/**
	 * , 
	 */
	private static final long serialVersionUID = 1L;
	
@NotNull	
private String titreModule;
private String descriptionModule;
@NotNull
private int nombreHeure;
	
	
	

}
