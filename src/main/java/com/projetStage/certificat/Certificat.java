package com.projetStage.certificat;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.cours.Cours;
import com.projetStage.etudiant.Etudiant;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Certificat  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
	
private String titre;

private String description;

private Date datOptention;
	

@OneToOne(mappedBy = "certificat")
private Cours cours;

@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "etudiantId")
private Etudiant etudiant;

}
