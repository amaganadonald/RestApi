package com.gedpro.demo.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gedpro.demo.Entities.Employes;
import com.gedpro.demo.Services.EmployeService;

@RestController
public class EmployesRestController {

    @Autowired	
	EmployeService employeService;

	
	/* Methode qui retourne la liste des employés */
    @GetMapping("/listEmployes")
	public List<Employes> allEmployes() {
		return employeService.viewEmployes();
	};
	
	/* Rechercher en employé par son identifiant*/
    @GetMapping("/listEmployes/{id}")
	public Optional<Employes> employeId(@PathVariable Long id) {
    	return employeService.employeId(id);
    };
    
    @PostMapping("/addEmploye/{id}")
    public ResponseEntity<?> addEmploye(@PathVariable Long id, @RequestBody Employes emp) {
    	return employeService.addEmploye(id, emp);
    }
	
	@PutMapping("/updateEmploye/{id}")
	public ResponseEntity<?> updateEmploye(@PathVariable Long id, @RequestBody Employes emp) {
		return employeService.updateEmploye(id, emp);
	}
	
	@DeleteMapping("/deleteEmploye/{id}")
	public ResponseEntity<?> deleteEmploye(@PathVariable Long id) {
		return employeService.deleteEmploye(id);
	}
}
