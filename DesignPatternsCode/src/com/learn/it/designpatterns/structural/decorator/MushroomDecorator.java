package com.learn.it.designpatterns.structural.decorator;

public class MushroomDecorator extends PizzaDecorator {

	public MushroomDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", added Mushroom!";
	}

	@Override
	public int getCost() {
		return super.getCost() + 5;
	}
}
