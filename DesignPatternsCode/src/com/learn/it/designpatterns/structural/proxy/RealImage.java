package com.learn.it.designpatterns.structural.proxy;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFileFromDisk();
	}

	private void loadFileFromDisk() {
		System.out.println("File loaded.");
	}

	@Override
	public void display() {
		System.out.println("Displaying image of " + fileName);
	}

}