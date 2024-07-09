package com.projetStage.services.communication;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.communication.PaiementDto;




public interface PaiementService {

public PaiementDto save(PaiementDto paimentDto);
public Optional<PaiementDto> findById(Integer id);
public List<PaiementDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
