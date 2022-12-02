package com.gedpro.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gedpro.demo.Entities.Departements;
import com.gedpro.demo.Entities.Employes;
import com.gedpro.demo.Repository.DepartementRepository;
import com.gedpro.demo.Repository.EmployesRepository;

@Service
public class EmployeServiceImpl implements EmployeService{
	

	EmployesRepository employeRepository;
	DepartementRepository departementRepository;
	
	

	public EmployeServiceImpl(EmployesRepository employeRepository, DepartementRepository departementRepository) {
		
		this.employeRepository = employeRepository;
		this.departementRepository = departementRepository;
	}



	@Override
	public List<Employes> viewEmployes() {
		return employeRepository.findAll();
	}



	@Override
	public Optional<Employes> employeId(Long id) {
		// TODO Auto-generated method stub
		return employeRepository.findById(id);
	}



	@Override
	public ResponseEntity<?> addEmploye(Long id, Employes emp) {
		try {
			Departements dept = departementRepository.findById(id).get();
			emp.setDepartment(dept);
			final Employes ep = employeRepository.save(emp);
		} catch(Throwable err) {
			return ResponseEntity.status(404).body("Departement inexistant dans la BD");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Employé ajoutée");
	}



	@Override
	public ResponseEntity<?> updateEmploye(Long id, Employes emp) {
		
		try {
			Departements dept = departementRepository.findById(id).get();
			Employes emps = employeRepository.findById(emp.getId()).get();
			emps.setDepartment(dept);
			emps.setLogin(emp.getLogin());
			emps.setMatricule(emp.getMatricule());
			emps.setNom(emp.getNom());
			emps.setPrenom(emp.getPrenom());
			emps.setTelephone(emp.getTelephone());
			employeRepository.save(emps);
		} catch(Throwable err) {
			return ResponseEntity.status(404).body("Employe inexistant dans la BD");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Employé Modifié Avec Succès");
	}



	@Override
	public ResponseEntity<?> deleteEmploye(Long id) {
		try {
			Employes ep = employeRepository.findById(id).get();
			employeRepository.deleteById(ep.getId());
		} catch(Throwable err) {
			return ResponseEntity.status(404).body("Employe Inexistant dans la BD");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Employe supprimé");
	}

}
