package com.learn.it.designpatterns.structural.adapter;

public class SendGridAdapter implements NotificationService {

	private SendGridEmailService sendGridEmailService;

	public SendGridAdapter(SendGridEmailService sendGridEmailService) {
		this.sendGridEmailService = sendGridEmailService;
	}

	@Override
	public void sendEmail(String to, String subject, String body) {
		this.sendGridEmailService.send(new EmailDTO(to, subject, body));
	}

}
