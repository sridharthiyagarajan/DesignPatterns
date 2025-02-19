package com.learn.it.designpatterns.behavioural.template;

public class XmlParser extends FileParser {

	@Override
	protected void parseFile() {
		System.out.println("Parsing XML file.");
	}

}
