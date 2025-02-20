package com.learn.it.designpatterns.structural.proxy;

public class ProxyMain {

	public static void main(String[] args) {

		Image cat = new ProxyImage("Cat");

		cat.display();

		cat.display();
	}

}
