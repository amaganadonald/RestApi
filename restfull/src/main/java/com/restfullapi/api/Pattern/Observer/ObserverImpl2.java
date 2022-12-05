package com.restfullapi.api.Pattern.Observer;

public class ObserverImpl2 implements Observer{

	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl)observable).getState();
		//double res = state*state+9;
		System.out.println("****Observer II************");
		System.out.println("new upadte state = " + state);
		System.out.println("La valeur est : " + ((state%2)==0?"pair":"impair"));
		System.out.println("****************");
	}

}
