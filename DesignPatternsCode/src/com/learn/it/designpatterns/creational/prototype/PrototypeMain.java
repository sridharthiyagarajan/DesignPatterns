package com.learn.it.designpatterns.creational.prototype;

public class PrototypeMain {

	public static void main(String[] args) {

		Circle clonedCircle = (Circle) ShapeRegistry.getPrototype("Circle");
		System.out.println(clonedCircle);

		Rectangle clonedRectangle = (Rectangle) ShapeRegistry.getPrototype("Rectangle");
		System.out.println(clonedRectangle);
	}

}
