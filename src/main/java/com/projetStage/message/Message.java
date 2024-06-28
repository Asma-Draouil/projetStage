package com.projetStage.message;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.projetStage.utilisateur.Utilisateur;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Message  {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private Date date;

private String contenu;	

@ManyToOne	(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.NO_ACTION)
@JoinColumn(name = "utilisateurId")
private Utilisateur utilisateur;

}
