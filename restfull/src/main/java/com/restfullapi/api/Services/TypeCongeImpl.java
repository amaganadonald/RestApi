package com.restfullapi.api.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restfullapi.api.Entities.TypeConges;
import com.restfullapi.api.Repository.TypeCongesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TypeCongeImpl implements ITypeConge{
	
	TypeCongesRepository typeCongesRepository;
	

	public TypeCongeImpl(TypeCongesRepository typeCongesRepository) {
		this.typeCongesRepository = typeCongesRepository;
	}

	@Override
	public List<TypeConges> allTypeConges() {
		return typeCongesRepository.findAll();
	}

	@Override
	public TypeConges saveTypeConge(TypeConges typeConge) {
		return typeCongesRepository.save(typeConge);
	}

}
