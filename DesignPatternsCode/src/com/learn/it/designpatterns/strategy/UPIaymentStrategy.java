package com.learn.it.designpatterns.strategy;

public class UPIaymentStrategy implements PaymentStrategy {

	@Override
	public void makePayment() {
		System.out.println("Making payment via debit card payment strategy.");
	}

}
