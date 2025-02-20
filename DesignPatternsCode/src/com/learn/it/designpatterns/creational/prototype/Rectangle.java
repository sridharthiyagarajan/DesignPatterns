package com.learn.it.designpatterns.creational.prototype;

public class Rectangle implements Prototype {

	private int height;

	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public Rectangle clone() {
		return new Rectangle(this.height, this.width);
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

}