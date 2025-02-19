package com.learn.it.designpatterns.creational.factory;

public class Flight implements Transport {

	@Override
	public void deliver() {
		System.out.println("Flight delivery.");
	}

}
