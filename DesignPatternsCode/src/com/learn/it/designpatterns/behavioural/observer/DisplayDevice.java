package com.learn.it.designpatterns.behavioural.observer;

public class DisplayDevice implements Observer {

	private String displayName;

	public DisplayDevice(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public void update(float temp) {
		System.out.println(String.format("Temperature updated in display device with the name %s is : %s C",
				getDisplayName(), temp));
	}

}
