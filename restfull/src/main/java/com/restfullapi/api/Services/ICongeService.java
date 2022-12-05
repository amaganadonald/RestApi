package com.restfullapi.api.Services;

import java.util.List;

import com.restfullapi.api.Entities.Conges;
public interface ICongeService {
	
	List<Conges> allConges();
	Conges saveConge(Conges conge, Long demandeId);
	

}
