package com.learn.it.designpatterns.behavioural.state;

public class CyclingState implements TransportationState {

	@Override
	public int getETA() {
		return 8;
	}

	@Override
	public String getDirection() {
		return "Cycling direction";
	}

}
