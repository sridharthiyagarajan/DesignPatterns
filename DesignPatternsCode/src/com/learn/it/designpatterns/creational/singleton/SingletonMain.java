package com.learn.it.designpatterns.creational.singleton;

public class SingletonMain {

	public static void main(String[] args) {

		AppSettings appSettings = AppSettings.getInstance();
		System.out.println(appSettings.getDatabaseUrl());
	}

}
