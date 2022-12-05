package com.restfullapi.api.Services;

import java.util.Collection;
import org.springframework.stereotype.Service;

import com.restfullapi.api.Entities.Departement;
import com.restfullapi.api.Entities.Employes;
import com.restfullapi.api.Entities.Roles;
import com.restfullapi.api.Repository.DepartementRepository;
import com.restfullapi.api.Repository.EmployesRepository;
import com.restfullapi.api.Repository.RolesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeServiceImpl implements IEmployeService {
	private EmployesRepository  employesRepository;
	private DepartementRepository departementRepository;
	private RolesRepository rolesRepository;
	

	public EmployeServiceImpl(EmployesRepository employesRepository, DepartementRepository departementRepository,
			RolesRepository rolesRepository) {
		this.employesRepository = employesRepository;
		this.departementRepository = departementRepository;
		this.rolesRepository = rolesRepository;
	}

	@Override
	public Collection<Employes> allEmployes() {
		return employesRepository.findAll();
	}

	@Override
	public Employes saveEmploye(Employes employe, Long departementId) {
		Departement departement = departementRepository.findById(departementId).orElse(null);
		if(departement != null) {
			employe.setDepartement(departement);
		}
		return employesRepository.save(employe);
	}

	@Override
	public Roles addRole(Roles role) {
		return rolesRepository.save(role);
	}

	@Override
	public Employes findEmployesByName(String name) {
		return employesRepository.findByNom(name);
	}

	@Override
	public void addRolesEmploye(Long idRole, String login) {
		Employes emp = employesRepository.findByLogin(login);
		Roles role = rolesRepository.findById(idRole).get();
		emp.getRole().add(role);
		role.getEmploye().add(emp);
	}

}
