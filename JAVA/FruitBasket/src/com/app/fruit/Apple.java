package com.app.fruit;

public class Apple extends Fruit {

	public Apple() {

	}

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
	}

	@Override
	public String taste() {

		return "sweet and sour";
	}

	public void jam() {
		System.out.println(getName() + " making jam!!!");
	}

}
