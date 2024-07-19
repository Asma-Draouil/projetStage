package com.projetStage.services.utilisateurs.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projetStage.models.dto.utilisateurs.AdresseDto;
import com.projetStage.models.dto.utilisateurs.UtilisateurDto;
import com.projetStage.models.entities.utilisateurs.Utilisateur;
import com.projetStage.models.mappers.utilisateurs.AdresseMapper;
import com.projetStage.models.mappers.utilisateurs.UtilisateurMapper;
import com.projetStage.repositories.utilisateurs.UtilisateurRepository;
import com.projetStage.services.utilisateurs.UtilisateurService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
	
	private final UtilisateurRepository userRepository;
	
	@Override
	public UtilisateurDto save(UtilisateurDto userDto) {
		Utilisateur user = UtilisateurMapper.convertToEntity(userDto);
		return UtilisateurMapper.convertToDto(userRepository.save(user));
	}

	@Override
	public UtilisateurDto findById(Integer id) {

		return userRepository.findById(id).map(UtilisateurMapper::convertToDto)
				.orElseThrow(()-> new EntityNotFoundException("Aucun utilisateur trouvé avec l'ID : " +id));
	}

	@Override
	public List<UtilisateurDto> findAll() {
		
		return userRepository.findAll()
				.stream()
				.map(UtilisateurMapper::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public UtilisateurDto assignAdresseToUtilisateur(Integer idUtilisateur, AdresseDto adresseDto) {
		Utilisateur utilisateur = userRepository.findById(idUtilisateur)
				.orElseThrow(()-> new EntityNotFoundException("Aucun utilisateur trouvé avec l'ID : " +idUtilisateur));
		
		if(utilisateur != null) 
		{
			utilisateur.setAdresse(AdresseMapper.convertToEntity(adresseDto));
			
			return UtilisateurMapper.convertToDto(userRepository.save(utilisateur));
		}
		return null;
	}

}
