package com.gedpro.demo.Services;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.gedpro.demo.Entities.TypeConges;

public interface TypeCongesService {

	List<TypeConges>  allTypeConges();

	ResponseEntity<?> typeConges(Long id);

	TypeConges addTypeConge(TypeConges conge);

	ResponseEntity<TypeConges> updateTypeConges(Long id, TypeConges typecong);

	Map<String, Boolean> delTypeConges(Long id);

}
