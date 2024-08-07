package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.projetStage.models.dto.utilisateurs.EtudiantDto;
import com.projetStage.models.entities.communication.Certificat;
import com.projetStage.models.entities.communication.Paiement;
import com.projetStage.models.entities.education.Cours;
import com.projetStage.models.entities.utilisateurs.Etudiant;
import com.projetStage.models.mappers.utilisateurs.EtudiantMapper;
import com.projetStage.repositories.communication.CertificatRepository;
import com.projetStage.repositories.communication.PaiementRepository;
import com.projetStage.repositories.education.CoursRepository;
import com.projetStage.repositories.utilisateurs.EtudiantRepository;
import com.projetStage.services.utilisateurs.EtudiantService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
	
	private final EtudiantRepository etudiantRepository;
	private final CoursRepository coursRepository;
	private final CertificatRepository certifRepository;
	private final PaiementRepository paiementRepository;
	

	
	@Override
	public EtudiantDto save(EtudiantDto etudiantDto) {
		Etudiant etudiant = EtudiantMapper.convertToEntity(etudiantDto);
		return EtudiantMapper.convertToDto(etudiantRepository.save(etudiant));
	}

	@Override
	public EtudiantDto findById(Integer id) {
	
		return etudiantRepository.findById(id).map(EtudiantMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun etudiant trouvé avec l'ID : " +id));
	}

	@Override
	public List<EtudiantDto> findAll() {
		
		return etudiantRepository.findAll()
				.stream()
				.map(EtudiantMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		etudiantRepository.deleteAll();
		
	}

	@Override
	public EtudiantDto assignCoursToEtudiant(Integer idEtudiant, Integer idCours) {
		Etudiant etudiant = etudiantRepository.findById(idEtudiant)
				.orElseThrow(()-> new EntityNotFoundException("Aucun etudiant trouvé avec l'ID : " +idEtudiant));
		Cours cours = coursRepository.findById(idCours)
				.orElseThrow(()-> new EntityNotFoundException("Aucun cours trouvé avec l'ID : " +idCours));
		
		if(etudiant != null && cours != null) 
		{
			Set<Cours> setOfCours = etudiant.getCours();
			setOfCours.add(cours);
			etudiant.setCours(setOfCours);
		}
		return EtudiantMapper.convertToDto(etudiantRepository.save(etudiant));
	}

	@Override
	public EtudiantDto assignCertifToEtudiant(Integer idEtudiant, Integer idCertificat) {
		Etudiant etudiant = etudiantRepository.findById(idEtudiant)
				.orElseThrow(()-> new EntityNotFoundException("Aucun etudiant trouvé avec l'ID : " +idEtudiant));
		
		Certificat certificat = certifRepository.findById(idCertificat)
				.orElseThrow(()-> new EntityNotFoundException("Aucun certificat trouvé avec l'ID : " +idCertificat));
		
		if(etudiant != null && certificat != null)
		{
			Set<Certificat> certifs = etudiant.getCertificats();
			certifs.add(certificat);
			etudiant.setCertificats(certifs);
		}
		return EtudiantMapper.convertToDto(etudiantRepository.save(etudiant));
	}

	@Override
	public EtudiantDto assignPaiementToEtudiant(Integer idEtudiant, Integer idPaiement) {
		Etudiant etudiant = etudiantRepository.findById(idEtudiant)
				.orElseThrow(()-> new EntityNotFoundException("Aucun etudiant trouvé avec l'ID : " +idEtudiant));
		Paiement paiement = paiementRepository.findById(idPaiement)
				.orElseThrow(()-> new EntityNotFoundException("Aucun paiement trouvé avec l'ID : " +idPaiement));
		
		if(etudiant != null && paiement != null)
		{
			Set<Paiement> paiements = etudiant.getPaiements();
			paiements.add(paiement);
			etudiant.setPaiements(paiements);
		}

			
		return EtudiantMapper.convertToDto(etudiantRepository.save(etudiant));
	}
	
	
	

}
