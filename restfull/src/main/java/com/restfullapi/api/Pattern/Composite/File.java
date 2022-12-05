package com.restfullapi.api.Pattern.Composite;

public class File extends Composant {

	public File(String name) {
		super(name);
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab+" Fichier : "+name);
		
	}

}
