package com.learn.it.designpatterns.behavioural.command;

public class BoldCommand implements Command {

	private TextEditor textEditor;

	public BoldCommand(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void execute() {
		this.textEditor.boldText();
	}

}
