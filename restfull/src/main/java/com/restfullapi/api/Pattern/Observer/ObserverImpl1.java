package com.restfullapi.api.Pattern.Observer;

public class ObserverImpl1 implements Observer{

	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl)observable).getState();
		double res = state*state+9;
		System.out.println("****Observer I************");
		System.out.println("new upadte state = " + state);
		System.out.println("Result res = " + res);
		System.out.println("****************");
	}

}
