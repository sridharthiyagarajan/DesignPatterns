package com.learn.it.designpatterns.creational.factory;

public class Car implements Transport {

	@Override
	public void deliver() {
		System.out.println("Car delivery.");
	}

}
