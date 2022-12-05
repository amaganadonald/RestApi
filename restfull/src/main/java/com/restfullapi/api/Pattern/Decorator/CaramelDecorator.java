package com.restfullapi.api.Pattern.Decorator;

public class CaramelDecorator extends AbstractDecorator{

	public CaramelDecorator(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + "Au Caramel";
	}

	@Override
	public double cout() {
		return 10.5 + boisson.cout();
	}

}
