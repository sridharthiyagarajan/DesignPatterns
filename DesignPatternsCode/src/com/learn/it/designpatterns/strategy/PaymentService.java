package com.learn.it.designpatterns.strategy;

public class PaymentService {

	private PaymentStrategy paymentStrategy;

	public PaymentService(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void payAmount() {
		this.paymentStrategy.makePayment();
	}
}
