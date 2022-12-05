package com.restfullapi.api.Services;

import java.util.List;

import com.restfullapi.api.Entities.TypeConges;

public interface ITypeConge {
	List<TypeConges> allTypeConges();
	TypeConges saveTypeConge(TypeConges typeConge);
}
