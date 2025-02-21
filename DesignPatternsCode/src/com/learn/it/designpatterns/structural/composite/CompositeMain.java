package com.learn.it.designpatterns.structural.composite;

public class CompositeMain {

	public static void main(String[] args) {

		File javaFile = new File("Java File");
		File pythonFile = new File("Python File");

		Folder mainFolder = new Folder("Main Folder");
		mainFolder.addComponent(javaFile);
		mainFolder.addComponent(pythonFile);

		Folder subFolder = new Folder("Sub Folder");
		File subFile1 = new File("Sub File 1");
		File subFile2 = new File("Sub File 2");
		subFolder.addComponent(subFile1);
		subFolder.addComponent(subFile2);

		mainFolder.addComponent(subFolder);

		mainFolder.showDetils();
	}

}
