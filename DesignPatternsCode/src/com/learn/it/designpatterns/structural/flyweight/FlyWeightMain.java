package com.learn.it.designpatterns.structural.flyweight;

public class FlyWeightMain {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Bullet bullet = new Bullet("red", i * 2, i * 3, i * 5);
			bullet.display();
		}

		for (int i = 0; i < 10; i++) {
			Bullet bullet = new Bullet("green", i * 6, i * 7, i * 8);
			bullet.display();
		}
	}

}
