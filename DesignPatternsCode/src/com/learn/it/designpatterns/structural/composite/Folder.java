package com.learn.it.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

	private String name;

	private List<FileSystemComponent> components;

	public Folder(String name) {
		this.name = name;
		this.components = new ArrayList<>();
	}

	public void addComponent(FileSystemComponent fileSystemComponent) {
		this.components.add(fileSystemComponent);
	}

	@Override
	public void showDetils() {

		System.out.println("Folder name: " + name);

		for (FileSystemComponent component : this.components) {
			component.showDetils();
		}
	}
}
