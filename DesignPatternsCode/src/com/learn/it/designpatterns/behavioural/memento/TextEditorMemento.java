package com.learn.it.designpatterns.behavioural.memento;

public class TextEditorMemento {

	private final String content;

	public TextEditorMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}
}
