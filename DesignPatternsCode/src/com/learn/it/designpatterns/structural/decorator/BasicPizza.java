package com.learn.it.designpatterns.structural.decorator;

public class BasicPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Basic Pizza";
	}

	@Override
	public int getCost() {
		return 2;
	}

}
