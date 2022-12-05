package com.restfullapi.api.Pattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{
	
	private List<Composant> composant = new ArrayList<>();

	public Folder(String name) {
		super(name);
	}

	@Override
	public void afficher() {
		String tab=indentation();
		System.out.println(tab+" Folder : "+name+" Parent : "+getParent());
		for(Composant c:composant) {
			c.afficher();
		}
	}
	
	public Composant addComposant(Composant composant) {
		composant.level = this.level+1;
		composant.parent = this;
		this.composant.add(composant);
		return composant;
	}
	
	public Composant getComponent(String name) {
		for(Composant c:composant)	{
			if(c.name.equals(name)) return c;
		}
		return null;
	}
	
	public Composant getParent() {
		return this.parent;
	}

}
