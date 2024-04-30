package com.projetStage.admin;

import com.projetStage.utilisateur.Utilisateur;

import jakarta.persistence.Entity;

import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter                   
public class Admin extends Utilisateur {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
