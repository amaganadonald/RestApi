package com.restfullapi.api.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restfullapi.api.Entities.Departement;
import com.restfullapi.api.Services.IDepartement;

@RestController
public class DepartementRestController {

	IDepartement iDepartement;

	public DepartementRestController(IDepartement iDepartement) {
		this.iDepartement = iDepartement;
	}
	
	@GetMapping("/allDepartement")
	public List<Departement>  allDepartement(){
		return iDepartement.allDepartement();
	}
	
	@PostMapping("/addDepartement")
	public Departement addDepartement(@RequestBody Departement departement) {
		return iDepartement.saveDepartment(departement);
	}
	
}
