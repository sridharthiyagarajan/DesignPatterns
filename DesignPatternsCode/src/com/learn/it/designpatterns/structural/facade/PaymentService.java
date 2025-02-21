package com.learn.it.designpatterns.structural.facade;

public class PaymentService {

	public String getPaymentDetails(String paymentId) {
		return String.format("Payment details for the given user %s.", paymentId);
	}
}
