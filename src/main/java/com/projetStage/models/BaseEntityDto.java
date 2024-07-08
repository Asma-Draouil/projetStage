package com.projetStage.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntityDto {
	
	private Integer id;
	
	private Date createdAt;
	
	private Date updatedAt;
}
