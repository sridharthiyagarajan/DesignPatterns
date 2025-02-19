package com.learn.it.designpatterns.behavioural.state;

public class StateMain {

	public static void main(String[] args) {

		DirectionService directionService = new DirectionService(new WalkingState());

		System.out.println(directionService.getDirection());
		System.out.println(directionService.getETA());

		directionService.setTransportationMode(new CarState());

		System.out.println(directionService.getDirection());
		System.out.println(directionService.getETA());
	}
}
