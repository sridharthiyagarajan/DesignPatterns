package com.learn.it.designpatterns.memento;

import java.util.Stack;

public class CareTaker {

	private Stack<TextEditorMemento> history;
	
	public CareTaker() {
		history = new Stack<>();
	}
	
	public void save(TextEditorMemento textEditorMemento) {
		history.push(textEditorMemento);
	}
	
	public void undo(TextEditor textEditor) {
		
		if(!history.isEmpty()) {
			history.pop();
			textEditor.writeContent(history.peek().getContent());
		}
	}
}
