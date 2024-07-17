package com.projetStage.services.communication;

import java.util.List;
import com.projetStage.models.dto.communication.PaiementDto;




public interface PaiementService {

public PaiementDto save(PaiementDto paimentDto);
public PaiementDto findById(Integer id);
public List<PaiementDto> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
