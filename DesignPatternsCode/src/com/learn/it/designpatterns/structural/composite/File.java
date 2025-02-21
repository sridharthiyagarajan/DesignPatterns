package com.learn.it.designpatterns.structural.composite;

public class File implements FileSystemComponent {

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void showDetils() {
		System.out.println(String.format("File name is %s.", this.fileName));
	}

}