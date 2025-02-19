package com.learn.it.designpatterns.behavioural.state;

public class CarState implements TransportationState {

	@Override
	public int getETA() {
		return 2;
	}

	@Override
	public String getDirection() {
		return "Car direction";
	}

}
