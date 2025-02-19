package com.learn.it.designpatterns.behavioural.state;

public class BikeState implements TransportationState {

	@Override
	public int getETA() {
		return 4;
	}

	@Override
	public String getDirection() {
		return "Bike direction";
	}

}
