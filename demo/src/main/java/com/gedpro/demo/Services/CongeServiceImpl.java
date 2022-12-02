package com.gedpro.demo.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gedpro.demo.Entities.Conges;
import com.gedpro.demo.Entities.Employes;
import com.gedpro.demo.Entities.TypeConges;
import com.gedpro.demo.Repository.CongesRepository;
import com.gedpro.demo.Repository.EmployesRepository;
import com.gedpro.demo.Repository.TypeCongesRepository;

@Service
public class CongeServiceImpl implements CongeService{
	
	CongesRepository congesRepository;
	EmployesRepository employesRepository;
	TypeCongesRepository typeCongesRepository;

	public CongeServiceImpl(CongesRepository congesRepository, 
			EmployesRepository employesRepository,
			TypeCongesRepository typeCongesRepository) {
		this.congesRepository = congesRepository;
		this.employesRepository = employesRepository;
		this.typeCongesRepository = typeCongesRepository;
	}


	@Override
	public List<Conges> allConges() {
		return congesRepository.findAll();
	}


	@Override
	public ResponseEntity<?> addConge(Long id, Long typeId, Conges conge) {
		TypeConges typeConge = new TypeConges();
		Employes emp  = new Employes();
		try {
			typeConge = typeCongesRepository.findById(typeId).get();
		} catch (Throwable err){
			return ResponseEntity.status(404).body("Type de Congés Inexistant");
		}
		try {
			emp = employesRepository.findById(id).get();
		} catch(Throwable err) {
			return ResponseEntity.status(404).body("Employé inexistant");
		}
		conge.setEmploye(emp);
		conge.setTypeConge(typeConge);
		congesRepository.save(conge);
		return ResponseEntity.status(HttpStatus.OK).body("Congé ajouté avec succèss");
	}



}
