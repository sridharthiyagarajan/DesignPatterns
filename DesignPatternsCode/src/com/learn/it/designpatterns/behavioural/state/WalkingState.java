package com.learn.it.designpatterns.behavioural.state;

public class WalkingState implements TransportationState {

	@Override
	public int getETA() {
		return 10;
	}

	@Override
	public String getDirection() {
		return "Walking direction";
	}

}
