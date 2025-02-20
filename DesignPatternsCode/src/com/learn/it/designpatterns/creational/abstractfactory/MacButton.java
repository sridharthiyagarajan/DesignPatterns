package com.learn.it.designpatterns.creational.abstractfactory;

public class MacButton implements Button {

	@Override
	public void render() {
		System.out.println("Mac button is rendered.");
	}

}