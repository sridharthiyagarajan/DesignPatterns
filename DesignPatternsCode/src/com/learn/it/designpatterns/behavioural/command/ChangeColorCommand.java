package com.learn.it.designpatterns.behavioural.command;

public class ChangeColorCommand implements Command {

	private TextEditor textEditor;

	public ChangeColorCommand(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void execute() {
		this.textEditor.changeColor();
	}

}