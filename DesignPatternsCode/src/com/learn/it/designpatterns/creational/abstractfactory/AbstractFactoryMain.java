package com.learn.it.designpatterns.creational.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		Application application = new Application(new WindowsFactory());
		application.render();
	}

}