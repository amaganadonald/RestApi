package com.gedpro.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gedpro.demo.Entities.Departements;

public interface DepartementRepository extends JpaRepository<Departements, Long> {

}
