package com.learn.it.designpatterns.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void makePayment() {
		System.out.println("Making payment via credit card payment strategy.");
	}

}
