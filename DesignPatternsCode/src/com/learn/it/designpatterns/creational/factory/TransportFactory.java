package com.learn.it.designpatterns.creational.factory;

public class TransportFactory {

	public static Transport createTransport(String transport) {

		switch (transport) {
		case "bus":
			return new Bus();
		case "car":
			return new Car();
		case "flight":
			return new Flight();
		default:
			throw new IllegalArgumentException();
		}
	}
}
