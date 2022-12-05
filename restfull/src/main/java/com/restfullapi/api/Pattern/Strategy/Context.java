package com.restfullapi.api.Pattern.Strategy;

public class Context {
	
	private IStrategy strategy;
	
	public Context() {
		this.strategy = new StrategyDefault();
	}

	public void process() {
		System.out.println("Etape 1.....");
		strategy.appliquerStrategy();
		System.out.println("Fin de l'algoritjme");
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	
}
