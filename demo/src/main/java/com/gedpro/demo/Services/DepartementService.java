package com.gedpro.demo.Services;

import java.util.List;

import com.gedpro.demo.Entities.Departements;

public interface DepartementService {

	String deleteDepartement(Long id);

	List<Departements> allDepartement();

	Departements updateDepartement(Long id, Departements departement);

	Departements addDepartement(Departements departement);

	Long countDepart();

}
