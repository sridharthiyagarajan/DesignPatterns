package com.learn.it.designpatterns.structural.facade;

public class OrderService {

	public String getOrderDetails(String orderId) {
		return String.format("Order details for the given user %s.", orderId);
	}
}
