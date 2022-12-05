package com.restfullapi.api.Pattern.Decorator;

public class Deca extends Boisson{

	public Deca() {
		this.description = "Deca";
	}
	@Override
	public double cout() {
		return 10;
	}

}
