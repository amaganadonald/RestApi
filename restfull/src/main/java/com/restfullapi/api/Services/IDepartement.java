package com.restfullapi.api.Services;

import java.util.List;

import com.restfullapi.api.Entities.Departement;

public interface IDepartement {

	List<Departement> allDepartement();
	Departement saveDepartment(Departement departement);
}
