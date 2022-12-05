package com.restfullapi.api.Pattern.Proxy;

import java.util.Random;

public class Proxy implements Standard{
	
	private StandardImpl1 target;

	@Override
	public void process() {
		System.out.println("vérification paramètre de sécurité");
		boolean b = new Random().nextBoolean();
		if(b) {
			target  = new StandardImpl1();
			target.process();
		} else {
			throw new RuntimeException("Pas autorisé 403");
		}
		
	}

}
