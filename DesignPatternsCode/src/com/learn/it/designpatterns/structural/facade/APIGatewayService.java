package com.learn.it.designpatterns.structural.facade;

public class APIGatewayService {

	private UserService userService;

	private OrderService orderService;

	private PaymentService paymentService;

	public APIGatewayService() {
		this.userService = new UserService();
		this.orderService = new OrderService();
		this.paymentService = new PaymentService();
	}

	public String getCompleteDetailsOfOrder(String userId, String orderId, String paymentId) {
		String userDetails = this.userService.getUserDetails(userId);
		String orderDetails = this.orderService.getOrderDetails(orderId);
		String paymentDetails = this.paymentService.getPaymentDetails(paymentId);

		return String.format(
				"Complete details of the order is : User Details: %s, Order Details: %s, Payment Details: %s",
				userDetails, orderDetails, paymentDetails);
	}

}
