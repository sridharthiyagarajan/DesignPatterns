package com.learn.it.designpatterns.creational.abstractfactory;

public class WindowsButton implements Button {

	@Override
	public void render() {
		System.out.println("Windows button is rendered.");
	}

}