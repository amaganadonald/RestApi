package com.restfullapi.api.Services;

import java.util.Collection;

import com.restfullapi.api.Entities.Employes;
import com.restfullapi.api.Entities.Roles;

public interface IEmployeService {

	Collection<Employes> allEmployes();
	Employes saveEmploye(Employes employe, Long departementId);
	
	Roles addRole(Roles role);
	Employes findEmployesByName(String name);
	void addRolesEmploye(Long idRole, String login);
}
