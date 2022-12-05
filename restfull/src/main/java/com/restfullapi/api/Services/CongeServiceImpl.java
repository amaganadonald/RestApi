package com.restfullapi.api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restfullapi.api.Entities.Conges;
import com.restfullapi.api.Entities.PConges;
import com.restfullapi.api.Repository.CongesRepository;
import com.restfullapi.api.Repository.PCongesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CongeServiceImpl implements ICongeService{
	
	CongesRepository congesRepository;
	PCongesRepository pCongesRepository;
	

	public CongeServiceImpl(CongesRepository congesRepository, PCongesRepository pCongesRepository) {
		this.congesRepository = congesRepository;
		this.pCongesRepository = pCongesRepository;
	}

	@Override
	public List<Conges> allConges() {
		return congesRepository.findAll();
	}

	@Override
	public Conges saveConge(Conges conge, Long demandeId) {
		Conges cong = new Conges();
		PConges demande = pCongesRepository.findById(demandeId).orElse(null);
		if (demande != null) {
			conge.setDemande(demande);
			cong = congesRepository.save(conge);
		}
		return cong;
	}

}
