package com.gedpro.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gedpro.demo.Entities.Employes;

public interface EmployesRepository extends JpaRepository<Employes, Long> {

}
