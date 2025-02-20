package com.learn.it.designpatterns.creational.builder;

public class Car {

	private String color;

	private String model;

	private String category;

	private boolean isAutomatic;

	private boolean isSunRoofNeeded;

	private boolean isLeatherSeatNeeded;

	private Car(CarBuilder carBuilder) {
		this.model = carBuilder.model;
		this.category = carBuilder.category;
		this.color = carBuilder.color;
		this.isAutomatic = carBuilder.isAutomatic;
		this.isLeatherSeatNeeded = carBuilder.isLeatherSeatNeeded;
		this.isSunRoofNeeded = carBuilder.isSunRoofNeeded;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", category=" + category + ", isAutomatic=" + isAutomatic
				+ ", isSunRoofNeeded=" + isSunRoofNeeded + ", isLeatherSeatNeeded=" + isLeatherSeatNeeded + "]";
	}

	public static class CarBuilder {

		private String color;

		private String model;

		private String category;

		private boolean isAutomatic;

		private boolean isSunRoofNeeded;

		private boolean isLeatherSeatNeeded;

		public CarBuilder(String color, String model, String category, boolean isAutomatic) {
			this.color = color;
			this.model = model;
			this.category = category;
			this.isAutomatic = isAutomatic;
		}

		public CarBuilder setSunRoofNeeded(boolean isSunRoofNeeded) {
			this.isSunRoofNeeded = isSunRoofNeeded;
			return this;
		}

		public CarBuilder setLeatherSeatNeeded(boolean isLeatherSeatNeeded) {
			this.isLeatherSeatNeeded = isLeatherSeatNeeded;
			return this;
		}

		public Car build() {
			return new Car(this);
		}

	}

}
