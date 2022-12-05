package com.restfullapi.api.Pattern.Proxy;

public class Client {
	
	private Standard standard;
	
	public void process() {
		standard.process();
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	
	

}
