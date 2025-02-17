package com.learn.it.designpatterns.command;

public class CommandMain {

	public static void main(String[] args) {

		Button button = new Button(new BoldCommand(new TextEditor()));
		button.onClick();

		Button button2 = new Button(new ItalicizeCommand(new TextEditor()));
		button2.onClick();
	}

}
