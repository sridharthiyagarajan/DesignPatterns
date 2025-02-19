package com.learn.it.designpatterns.creational.singleton;

public class AppSettings {

	private String databaseUrl;

	private AppSettings() {
		this.databaseUrl = "jdbc:postgresql://localhost:5432/mydatabase";
	}

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	private static class SingletonHelper {
		private static final AppSettings APP_SETTINGS_INSTANCE = new AppSettings();
	}

	public static AppSettings getInstance() {
		return SingletonHelper.APP_SETTINGS_INSTANCE;
	}
}