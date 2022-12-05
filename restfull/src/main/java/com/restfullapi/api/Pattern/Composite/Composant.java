package com.restfullapi.api.Pattern.Composite;

public abstract class Composant {
	
	protected String name;
	protected int level;
	protected Composant parent;
	
	
	
	public Composant(String name) {
		this.name = name;
	}

	public String indentation() {
		String str="";
		for (int i = 0; i < level;i++) {
			str+="\t";			
		}
		return str;
	}

	public abstract void afficher();

}
