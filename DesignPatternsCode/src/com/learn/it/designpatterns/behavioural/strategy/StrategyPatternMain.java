package com.learn.it.designpatterns.behavioural.strategy;

public class StrategyPatternMain {

	public static void main(String[] args) {

		PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
		PaymentStrategy debitCardPaymentStrategy = new DebitCardPaymentStrategy();

		PaymentService paymentService = new PaymentService(creditCardPaymentStrategy);
		paymentService.payAmount();

		paymentService = new PaymentService(debitCardPaymentStrategy);
		paymentService.payAmount();
	}

}
