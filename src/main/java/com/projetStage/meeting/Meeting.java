package com.projetStage.meeting;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.auditModel.AuditModel;
import com.projetStage.chapitre.Chapitre;
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
public class Meeting extends AuditModel {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
private String titreMeeting;

private String description;

private Date dateDebut, dateFin;

@ManyToOne(fetch = FetchType.LAZY)	
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "chapitreId")
private Chapitre chapitre;


}
