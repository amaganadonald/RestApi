package com.gedpro.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.gedpro.demo.Entities.Employes;

public interface EmployeService {

	List<Employes> viewEmployes();

	Optional<Employes> employeId(Long id);

	ResponseEntity<?> addEmploye(Long id, Employes emp);

	ResponseEntity<?> updateEmploye(Long id, Employes emp);

	ResponseEntity<?> deleteEmploye(Long id);
	
	

}
