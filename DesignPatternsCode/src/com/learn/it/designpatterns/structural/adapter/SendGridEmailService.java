package com.learn.it.designpatterns.structural.adapter;

public class SendGridEmailService {

	public void send(EmailDTO email) {
		System.out.println(email);
	}
}
