package com.projetStage.services.communication;

import java.util.List;

import com.projetStage.models.entities.communication.Commentaire;

public interface CommentaireService {
public void save(Commentaire commentaire);
public Commentaire findById(Integer id);
public List<Commentaire> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
