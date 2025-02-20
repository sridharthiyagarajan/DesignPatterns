package com.learn.it.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {

	private static Map<String, Prototype> prototypes = new HashMap<>();

	static {
		prototypes.put("Circle", new Circle(10));
		prototypes.put("Rectangle", new Rectangle(10, 10));
	}

	public static Prototype getPrototype(String key) {
		return prototypes.get(key).clone();
	}

}