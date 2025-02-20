package com.learn.it.designpatterns.creational.abstractfactory;

public class WindowsScrollBar implements ScrollBar {

	@Override
	public void scroll() {
		System.out.println("Windows scroll bar is rendered.");
	}

}
