package com.projetStage.models.entities.education;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.models.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chapitre extends BaseEntity {/**
	 * , 
	 */
	private static final long serialVersionUID = 1L;
	
private String titre;

private String description;

private int nombreHeure;
	
@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "coursId")
private Cours cours;
	
@OneToMany(mappedBy = "chapitre")
private Set<Meeting> meetings = new HashSet<>();


@OneToMany(mappedBy = "chapitre")
private Set<Video> videos = new HashSet<>();

@OneToMany(mappedBy = "chapitre")
private Set<Audio> audios = new HashSet<>();

@OneToMany(mappedBy = "chapitre")
private Set<Document> documents = new HashSet<>();

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "quizId")
private Quiz quiz;
}
