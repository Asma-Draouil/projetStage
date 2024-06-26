package com.projetStage.certificat;

import java.util.List;

public interface CertificatService {
public void save(Certificat certif);
public Certificat findById(Integer id);
public List<Certificat> findAll();
public void deleteById(Integer id);
public void deleteAll();
}
