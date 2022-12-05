package com.restfullapi.api.Pattern.Singleton;

public class PatternSignleton {

	private static PatternSignleton patternSgn;
	
	private PatternSignleton() {
		
	}
	
	public static PatternSignleton getInstances() {
		if (patternSgn == null) {
			patternSgn = new PatternSignleton();
		}
		
		return patternSgn;
	}
}
