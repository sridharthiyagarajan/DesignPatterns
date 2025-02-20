package com.learn.it.designpatterns.structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		Pizza pizza = new BasicPizza();
		System.out.println(pizza.getDescription() + " -- " + pizza.getCost());

		pizza = new CheeseDecorator(pizza);
		System.out.println(pizza.getDescription() + " -- " + pizza.getCost());

		pizza = new MushroomDecorator(pizza);
		System.out.println(pizza.getDescription() + " -- " + pizza.getCost());

	}

}
