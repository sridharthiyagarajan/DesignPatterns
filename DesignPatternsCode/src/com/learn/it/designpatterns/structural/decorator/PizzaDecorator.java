package com.learn.it.designpatterns.structural.decorator;

public abstract class PizzaDecorator implements Pizza {

	private Pizza decoratedPizza;

	public PizzaDecorator(Pizza decoratedPizza) {
		this.decoratedPizza = decoratedPizza;
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription();
	}

	@Override
	public int getCost() {
		return decoratedPizza.getCost();
	}

}
