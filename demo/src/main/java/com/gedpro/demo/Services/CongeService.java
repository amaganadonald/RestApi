package com.gedpro.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gedpro.demo.Entities.Conges;

public interface CongeService {

	List<Conges> allConges();

	ResponseEntity<?> addConge(Long id, Long typeId, Conges conge);

	


}
