package com.learn.it.designpatterns.behavioural.command;

public class Button {

	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void onClick() {
		this.command.execute();
	}
}
