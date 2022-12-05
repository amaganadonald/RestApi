package com.restfullapi.api.Pattern.Decorator;

public class Expresso extends Boisson {

	public Expresso() {
		this.description = "Expreso";
	}
	
	@Override
	public double cout() {
		return 6;
	}

}
