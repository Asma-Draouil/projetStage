package com.projetStage.module;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.projetStage.audio.Audio;
import com.projetStage.auditModel.AuditModel;
import com.projetStage.cours.Cours;
import com.projetStage.meeting.Meeting;
import com.projetStage.video.Video;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
@ManyToOne(fetch = FetchType.LAZY)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(name = "coursId")
private Cours cours;
	
@OneToMany(mappedBy = "module")
private Set<Meeting> meetings = new HashSet<>();


@OneToMany(mappedBy = "module")
private Set<Video> videos = new HashSet<>();

@OneToMany(mappedBy = "module")
private Set<Audio> audios = new HashSet<>();


}
