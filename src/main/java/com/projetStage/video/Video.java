package com.projetStage.video;

import java.util.Date;

import com.projetStage.module.Module;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Video extends Module{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String titreVideo;
private Date duree;

}
