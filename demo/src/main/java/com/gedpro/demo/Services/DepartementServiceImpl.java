package com.gedpro.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gedpro.demo.Entities.Departements;
import com.gedpro.demo.Repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService{
	
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public String deleteDepartement(Long id) {
		Departements dept = departementRepository.findById(id).get();
		String txt = "";
		if (dept != null) {
			txt = "Departement supprimé";
		} else {
			departementRepository.deleteById(dept.getId());
			txt = "Ce Departement n'existe pas";
		}
		return txt;
	}

	@Override
	public List<Departements> allDepartement() {
		
		return departementRepository.findAll();
	}

	@Override
	public Departements updateDepartement(Long id, Departements departement) {
		Departements depart = departementRepository.findById(id).get();
		depart.setNomDepartement(departement.getNomDepartement());
		depart.setSigle(departement.getSigle());
		return departementRepository.save(depart);
	}

	@Override
	public Departements addDepartement(Departements departement) {
		return departementRepository.save(departement);
	}

	@Override
	public Long countDepart() {
		return departementRepository.count();
	}

}
