package com.learn.it.designpatterns.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {

		Car car = new Car.CarBuilder("Black", "Tata", "SUV", false).setLeatherSeatNeeded(false).setSunRoofNeeded(true)
				.build();

		System.out.println(car);
	}

}
