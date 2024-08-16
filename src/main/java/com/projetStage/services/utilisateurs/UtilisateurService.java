package com.projetStage.services.utilisateurs;

import java.util.List;

import com.projetStage.models.dto.communication.CommentaireDto;
import com.projetStage.models.dto.utilisateurs.AdresseDto;
import com.projetStage.models.dto.utilisateurs.UtilisateurDto;

public interface UtilisateurService {


	public UtilisateurDto save(UtilisateurDto userDto);
	public UtilisateurDto findById(Integer id);
	public List<UtilisateurDto> findAll();
	public void deleteById(Integer id);
	public UtilisateurDto assignAdresseToUtilisateur(Integer idUtilisateur, AdresseDto adresseDto);
	public UtilisateurDto assignCommentaireToUtilisateur(Integer idUtilisateur, CommentaireDto commentaireDto);
}
