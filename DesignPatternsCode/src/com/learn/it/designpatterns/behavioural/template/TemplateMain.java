package com.learn.it.designpatterns.behavioural.template;

public class TemplateMain {

	public static void main(String[] args) {

		FileParser fileParser = new PdfParser();
		fileParser.parse();

		FileParser fileParser2 = new XmlParser();
		fileParser2.parse();
	}

}
