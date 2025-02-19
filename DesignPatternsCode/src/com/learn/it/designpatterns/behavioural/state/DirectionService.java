package com.learn.it.designpatterns.behavioural.state;

public class DirectionService {

	private TransportationState transportationState;

	public DirectionService(TransportationState transportationState) {
		this.transportationState = transportationState;
	}

	public void setTransportationMode(TransportationState transportationState) {
		this.transportationState = transportationState;
	}

	public String getDirection() {
		return this.transportationState.getDirection();
	}

	public int getETA() {
		return this.transportationState.getETA();
	}

}
