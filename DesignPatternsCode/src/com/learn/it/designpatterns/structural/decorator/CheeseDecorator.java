package com.learn.it.designpatterns.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {

	public CheeseDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", added Cheese!";
	}

	@Override
	public int getCost() {
		return super.getCost() + 3;
	}
}
