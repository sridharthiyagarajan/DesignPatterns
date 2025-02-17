package com.learn.it.designpatterns.observer;

public class MobileDevice implements Observer {

	@Override
	public void update(float temp) {
		System.out.println(String.format("Temperature updated in Mobile device is : %s C", temp));
	}

}
