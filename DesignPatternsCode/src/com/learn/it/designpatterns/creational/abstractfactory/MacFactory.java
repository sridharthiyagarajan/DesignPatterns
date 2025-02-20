package com.learn.it.designpatterns.creational.abstractfactory;

public class MacFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MacScrollBar();
	}

}
