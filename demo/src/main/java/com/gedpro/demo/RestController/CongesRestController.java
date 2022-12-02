package com.gedpro.demo.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gedpro.demo.Entities.Conges;
import com.gedpro.demo.Services.CongeService;

@RestController
public class CongesRestController {

	CongeService congeService;

	public CongesRestController(CongeService congeService) {
		this.congeService = congeService;
	}
	
	@GetMapping("/AllConges")
	public List<Conges> allConges() {
		return congeService.allConges();
	}
	
	@PostMapping("/addConges/{id}/{typeId}")
	public ResponseEntity<?> addConges(@PathVariable Long id, @PathVariable Long typeId, @RequestBody Conges conge) {
		return congeService.addConge(id, typeId, conge);
	}
}
