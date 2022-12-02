package com.gedpro.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gedpro.demo.Entities.Departements;
import com.gedpro.demo.Services.DepartementService;

@RestController
public class DepartementRestController {

	@Autowired
	DepartementService departementService;
	
	@GetMapping("/listDepartements")
	public List<Departements> allDepartements() {
		return departementService.allDepartement();
	}
	
	@PostMapping("/addDepartement")
	public Departements addDepartement(@RequestBody Departements departement) {
		return departementService.addDepartement(departement);
	}
	
	@PutMapping("/updateDepartement/{id}")
	public Departements updateDepartement(@PathVariable Long id, 
			                               @RequestBody Departements departement) {
		return departementService.updateDepartement(id, departement);
	}
	
	
	@DeleteMapping("/deleteDepartement/{id}")
	public String deleteDepartement(@PathVariable Long id) {
		return departementService.deleteDepartement(id);
	}
	
	@GetMapping("countDepartment")
	public Long countDept() {
	  return departementService.countDepart();
	}
	
}
