package com.restfullapi.api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restfullapi.api.Entities.Employes;
import com.restfullapi.api.Entities.PConges;
import com.restfullapi.api.Entities.TypeConges;
import com.restfullapi.api.Repository.EmployesRepository;
import com.restfullapi.api.Repository.PCongesRepository;
import com.restfullapi.api.Repository.TypeCongesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PCongeServiceImpl implements IPcongeService{
	
	PCongesRepository pCongesRepository;
	EmployesRepository employesRepository;
	TypeCongesRepository typeCongesRepository;
	

	public PCongeServiceImpl(PCongesRepository pCongesRepository, EmployesRepository employesRepository,
			TypeCongesRepository typeCongesRepository) {
		this.pCongesRepository = pCongesRepository;
		this.employesRepository = employesRepository;
		this.typeCongesRepository = typeCongesRepository;
	}

	@Override
	public List<PConges> allDemande() {
		return pCongesRepository.findAll();
	}

	@Override
	public PConges askConge(PConges pconge, Long employeId, Long typeCongeId) {
		Employes emp = employesRepository.findById(employeId).orElse(null);
		TypeConges typeConge = typeCongesRepository.findById(typeCongeId).orElse(null);
		return null;
	}

}
