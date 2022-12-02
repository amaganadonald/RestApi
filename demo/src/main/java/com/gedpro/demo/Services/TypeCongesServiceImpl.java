package com.gedpro.demo.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gedpro.demo.Entities.TypeConges;
import com.gedpro.demo.Exception.ResourceNotFoundException;
import com.gedpro.demo.Repository.TypeCongesRepository;

@Service
public class TypeCongesServiceImpl implements TypeCongesService {
	
	TypeCongesRepository typeCongesRepository;	

	public TypeCongesServiceImpl(TypeCongesRepository typeCongesRepository) {
		this.typeCongesRepository = typeCongesRepository;
	}

	@Override
	public List<TypeConges>  allTypeConges() {
		return typeCongesRepository.findAll();
	}

	@Override
	public ResponseEntity<?> typeConges (Long id) {
		TypeConges typeCg = new TypeConges();
		try {
			typeCg = typeCongesRepository.findById(id).get();
		} catch (Throwable err) {
			return ResponseEntity.status(404).body("Cet Id ne Correspond à aucun Type de Congés");
		}
		return ResponseEntity.status(HttpStatus.OK).body(typeCg);
	}

	@Override
	public TypeConges addTypeConge(TypeConges conge) {
		return typeCongesRepository.save(conge);
	}

	@Override
	public ResponseEntity<TypeConges> updateTypeConges(Long id, TypeConges typecong) {
		TypeConges typeConges = typeCongesRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Type de congé avec l'identifiant " + id + " n'exite pas") );
		typeConges.setDescription(typecong.getDescription());
		typeConges.setLibelle(typecong.getLibelle());
		final TypeConges typeC = typeCongesRepository.save(typeConges);
		return ResponseEntity.ok(typeC);
	}

	@Override
	public Map<String, Boolean> delTypeConges(Long id) {
		TypeConges typeCone = typeCongesRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Suppression impossible. Type de congés pas trouvé"));
		typeCongesRepository.deleteById(typeCone.getId());
		Map<String, Boolean> response = new HashMap<>();
		response.put("Type Congé Supprimé", Boolean.TRUE);
		return response;
	}

}
