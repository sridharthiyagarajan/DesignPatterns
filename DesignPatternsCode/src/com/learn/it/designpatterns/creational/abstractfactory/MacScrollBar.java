package com.learn.it.designpatterns.creational.abstractfactory;

public class MacScrollBar implements ScrollBar {

	@Override
	public void scroll() {
		System.out.println("Mac scroll bar is rendered.");
	}

}
