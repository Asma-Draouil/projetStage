package com.projetStage.services.communication;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.communication.CommentaireDto;


public interface CommentaireService {
public CommentaireDto save(CommentaireDto commentaireDto);
public Optional<CommentaireDto> findById(Integer id);
public List<CommentaireDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
