package com.projetStage.services.communication;

import java.util.List;
import java.util.Optional;

import com.projetStage.models.dto.communication.CertificatDto;


public interface CertificatService {
	
public CertificatDto save(CertificatDto certifdto);
public Optional<CertificatDto> findById(Integer id);
public List<CertificatDto> findAll();
public void deleteById(Integer id);

}
