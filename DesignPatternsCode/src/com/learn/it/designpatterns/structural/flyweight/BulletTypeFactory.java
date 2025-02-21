package com.learn.it.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {

	private static final Map<String, BulletType> BULLET_TYPE_MAP = new HashMap<>();

	public static BulletType getBulletType(String color) {

		if (!BULLET_TYPE_MAP.containsKey(color)) {
			BULLET_TYPE_MAP.put(color, new BulletType(color));
		}

		return BULLET_TYPE_MAP.get(color);
	}
}
