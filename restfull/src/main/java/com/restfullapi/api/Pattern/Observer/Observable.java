package com.restfullapi.api.Pattern.Observer;

public interface Observable {
	
	public void subscribe(Observer o); //add Observer
	
	public void unSubscribe(Observer o);//remove Observer
	
	public void notifyObservers();//send Notification

}
