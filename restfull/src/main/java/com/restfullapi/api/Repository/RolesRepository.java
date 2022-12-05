package com.restfullapi.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfullapi.api.Entities.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long>{

}
