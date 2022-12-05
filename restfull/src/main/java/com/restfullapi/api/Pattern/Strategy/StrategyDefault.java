package com.restfullapi.api.Pattern.Strategy;

public class StrategyDefault implements IStrategy{

	@Override
	public void appliquerStrategy() {
		System.out.println("Etape par de default de l'algorithme");
	}

}
