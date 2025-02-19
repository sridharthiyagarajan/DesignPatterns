package com.learn.it.designpatterns.behavioural.command;

public class ItalicizeCommand implements Command {

	private TextEditor textEditor;

	public ItalicizeCommand(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void execute() {
		this.textEditor.italicizeText();
	}

}