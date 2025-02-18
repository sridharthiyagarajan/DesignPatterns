package com.learn.it.designpatterns.template;

public abstract class FileParser {

	public final void parse() {

		openFile();

		parseFile();

		closeFile();
	}

	protected void closeFile() {
		System.out.println("Closing file.");
	}

	protected abstract void parseFile();

	protected void openFile() {
		System.out.println("Opening file.");
	}
}
