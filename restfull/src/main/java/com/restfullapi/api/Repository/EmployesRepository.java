package com.restfullapi.api.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restfullapi.api.Entities.Employes;

public interface EmployesRepository extends JpaRepository<Employes, Long> {
	
	 List<Employes>  findByEstActif(Boolean estActif);
	
	@Query("select e from Employes e where dateNaissance > :x ")
	List<Employes> findOldEmploye(@Param("x") Date d);
	
	Employes  findByNom(String nom);
	
	Employes  findByLogin(String login);

}
