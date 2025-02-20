package com.learn.it.designpatterns.structural.adapter;

public class AdapterMain {

	public static void main(String[] args) {

		NotificationService emailNotificationService = new SendGridAdapter(new SendGridEmailService());
		emailNotificationService.sendEmail("test@test.com", "Subject", "Body");

	}

}