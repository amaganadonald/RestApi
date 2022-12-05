package com.restfullapi.api.Services;

import java.util.List;

import com.restfullapi.api.Entities.PConges;

public interface IPcongeService {
	List<PConges> allDemande();
	PConges askConge(PConges pconge, Long employeId, Long typeCongeId);
}
