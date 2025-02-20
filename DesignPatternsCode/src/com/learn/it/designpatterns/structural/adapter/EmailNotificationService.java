package com.learn.it.designpatterns.structural.adapter;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendEmail(String to, String subject, String body) {

		System.out.println("To : " + to);
		System.out.println("Subject: " + subject);
		System.out.println("Body: " + body);

	}

}