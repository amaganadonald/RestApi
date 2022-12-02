package com.gedpro.demo.RestController;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gedpro.demo.Entities.TypeConges;
import com.gedpro.demo.Services.TypeCongesService;

@RestController
public class TypeCongesRestController {

	TypeCongesService typeCongesService;

	public TypeCongesRestController(TypeCongesService typeCongesService) {
		this.typeCongesService = typeCongesService;
	}
	
	@GetMapping("/allTypeConges")
	public List<TypeConges>  allTypeConges() {
		return typeCongesService.allTypeConges();
	}
	
	@GetMapping("/typeConges/{id}")
	public ResponseEntity<?> typeConges(@PathVariable Long id) {
		return typeCongesService.typeConges(id);
	}
	
	@PostMapping(value="/addTypeConges")
	public TypeConges addTypeConges(@RequestBody TypeConges conge) {
		return typeCongesService.addTypeConge(conge);
	}
	
	@PutMapping("/updateTypeConges/{id}")
	public ResponseEntity<TypeConges> updateTypeConges(@PathVariable Long id, @RequestBody TypeConges typecong) {
		return typeCongesService.updateTypeConges(id, typecong);
	}
	
	@DeleteMapping("/deleteTypeConges/{id}")
	public Map<String, Boolean> delTypeConges(@PathVariable Long id) {
		return typeCongesService.delTypeConges(id);
	}
}
