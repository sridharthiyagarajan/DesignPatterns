package com.learn.it.designpatterns.structural.flyweight;

public class Bullet {

	private BulletType bulletType;

	private int x;

	private int y;

	private int velocity;

	public Bullet(String color, int x, int y, int velocity) {

		this.bulletType = BulletTypeFactory.getBulletType(color);
		this.x = x;
		this.y = y;
		this.velocity = velocity;

		System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
	}

	public void display() {
		System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity);
	}
}
