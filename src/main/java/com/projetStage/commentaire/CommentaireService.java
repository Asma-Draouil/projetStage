package com.projetStage.commentaire;

import java.util.List;

public interface CommentaireService {
public void save(Commentaire commentaire);
public Commentaire findById(Integer id);
public List<Commentaire> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
