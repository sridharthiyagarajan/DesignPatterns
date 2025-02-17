package com.learn.it.designpatterns.observer;

public class ObserverMain {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation();

		MobileDevice mobileDevice = new MobileDevice();
		DisplayDevice displayDevice = new DisplayDevice("LG LED");

		weatherStation.attach(mobileDevice);
		weatherStation.attach(displayDevice);

		weatherStation.setTemperature(25);

		weatherStation.setTemperature(26);

		weatherStation.detach(displayDevice);

		weatherStation.setTemperature(27);
	}

}
