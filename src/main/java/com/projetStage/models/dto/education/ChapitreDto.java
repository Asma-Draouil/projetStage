package com.projetStage.models.dto.education;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetStage.models.BaseEntityDto;
import com.projetStage.models.entities.education.Audio;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.education.Document;
import com.projetStage.models.entities.education.Meeting;
import com.projetStage.models.entities.education.Quiz;
import com.projetStage.models.entities.education.Video;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChapitreDto extends BaseEntityDto {
	
	@NotNull
	@NotEmpty
	private String titre;

	@NotNull
	@NotEmpty
	private String description;

	@NotNull
	@NotEmpty
	private int nombreHeure;
	
	@JsonIgnoreProperties
	private Cours cours;
	
	@JsonIgnoreProperties
	private Set<Meeting> meetings = new HashSet<>();
	
	@JsonIgnoreProperties
	private Set<Video> videos = new HashSet<>();
	
	@JsonIgnoreProperties
	private Set<Audio> audios = new HashSet<>();
	
	@JsonIgnoreProperties
	private Set<Document> documents = new HashSet<>();
	
	@JsonIgnoreProperties
	private Quiz quiz;
}
