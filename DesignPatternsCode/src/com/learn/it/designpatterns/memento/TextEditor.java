package com.learn.it.designpatterns.memento;

public class TextEditor {

	private String content;

	public String getContent() {
		return this.content;
	}

	public void writeContent(String content) {
		this.content = content;
	}

	public TextEditorMemento saveState() {
		return new TextEditorMemento(this.getContent());
	}

	public void restore(TextEditorMemento textEditorMemento) {
		this.content = textEditorMemento.getContent();
	}

}