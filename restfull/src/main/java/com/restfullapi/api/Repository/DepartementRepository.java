package com.restfullapi.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfullapi.api.Entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
