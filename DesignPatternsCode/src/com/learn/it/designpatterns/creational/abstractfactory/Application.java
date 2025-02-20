package com.learn.it.designpatterns.creational.abstractfactory;

public class Application {

	private Button button;

	private ScrollBar scrollBar;

	public Application(UIFactory uiFactory) {
		this.button = uiFactory.createButton();
		this.scrollBar = uiFactory.createScrollBar();
	}

	public void render() {
		this.button.render();
		this.scrollBar.scroll();
	}

}