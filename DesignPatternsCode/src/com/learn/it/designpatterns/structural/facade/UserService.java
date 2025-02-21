package com.learn.it.designpatterns.structural.facade;

public class UserService {

	public String getUserDetails(String userId) {
		return String.format("User details for the given user %s.", userId);
	}
}
