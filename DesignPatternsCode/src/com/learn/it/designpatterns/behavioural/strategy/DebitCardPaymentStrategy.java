package com.learn.it.designpatterns.behavioural.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void makePayment() {
		System.out.println("Making payment via debit card payment strategy.");
	}

}
