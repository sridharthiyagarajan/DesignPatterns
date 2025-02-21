package com.learn.it.designpatterns.structural.facade;

public class FacadeMain {

	public static void main(String[] args) {

		APIGatewayService apiGatewayService = new APIGatewayService();
		System.out.println(apiGatewayService.getCompleteDetailsOfOrder("User1", "Order1", "Payment1"));
	}

}