package com.restfullapi.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.restfullapi.api.Pattern.Singleton.Calcul;

class CalculTest {
	
	private Calcul calcul;

	@Test
	void test() {
		calcul = new Calcul();
		double a=5; double b=8;
		double expected=13;
		double res = calcul.somme(a, b);
		assertEquals(res, expected);
	}

}
