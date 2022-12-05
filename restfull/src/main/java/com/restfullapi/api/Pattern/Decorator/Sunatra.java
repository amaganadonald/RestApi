package com.restfullapi.api.Pattern.Decorator;

public class Sunatra extends Boisson{

	public Sunatra() {
		this.description = "Sunatra";
	}
	@Override
	public double cout() {
		return 15;
	}

}
