package com.restfullapi.api.Pattern.Decorator;

public class ChocolatDecorator extends AbstractDecorator{

	
	public ChocolatDecorator(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return 5 + boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au Chocolat";
	}

}
