package com.projetStage.services.communication;

import java.util.List;

import com.projetStage.models.entities.communication.Certificat;

public interface CertificatService {
public void save(Certificat certif);
public Certificat findById(Integer id);
public List<Certificat> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
