package com.learn.it.designpatterns.template;

public class PdfParser extends FileParser {

	@Override
	protected void parseFile() {
		System.out.println("Parsing PDF file.");
	}

}
