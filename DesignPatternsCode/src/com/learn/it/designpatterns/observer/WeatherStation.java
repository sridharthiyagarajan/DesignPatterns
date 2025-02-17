package com.learn.it.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private float temperature;

	private List<Observer> observers;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public void attach(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void detach(Observer obs) {
		observers.remove(obs);
	}

	public List<Observer> getObservers() {
		return this.observers;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;

		notifyObservers();
	}

	public float getTemperature() {
		return this.temperature;
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : getObservers()) {
			observer.update(getTemperature());
		}
	}

}
