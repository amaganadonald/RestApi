package com.restfullapi.api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restfullapi.api.Entities.Departement;
import com.restfullapi.api.Repository.DepartementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DepartementServiceImpl implements IDepartement {

	DepartementRepository departementRepository;
	
	public DepartementServiceImpl(DepartementRepository departementRepository) {
		this.departementRepository = departementRepository;
	}

	@Override
	public List<Departement> allDepartement() {
		return departementRepository.findAll();
	}

	@Override
	public Departement saveDepartment(Departement departement) {
		return departementRepository.save(departement);
	}

}
