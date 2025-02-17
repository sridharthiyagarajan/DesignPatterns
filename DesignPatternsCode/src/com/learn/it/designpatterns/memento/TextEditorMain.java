package com.learn.it.designpatterns.memento;

public class TextEditorMain {

	public static void main(String[] args) {

		TextEditor textEditor = new TextEditor();
		CareTaker careTaker = new CareTaker();

		textEditor.writeContent("Hello World!");
		careTaker.save(textEditor.saveState());

		textEditor.writeContent("Hello Asia!");
		careTaker.save(textEditor.saveState());

		textEditor.writeContent("Hello India!");
		careTaker.save(textEditor.saveState());

		System.out.println(textEditor.getContent());

		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());

	}
}
