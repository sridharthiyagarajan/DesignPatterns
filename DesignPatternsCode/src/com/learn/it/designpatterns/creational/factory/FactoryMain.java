package com.learn.it.designpatterns.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {

		Transport transport = TransportFactory.createTransport("bus");
		transport.deliver();
	}

}
