package com.learn.it.designpatterns.creational.factory;

public class Bus implements Transport {

	@Override
	public void deliver() {
		System.out.println("Bus delivery.");
	}

}
