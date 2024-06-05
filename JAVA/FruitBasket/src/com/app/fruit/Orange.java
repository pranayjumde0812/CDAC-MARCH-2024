package com.app.fruit;

public class Orange extends Fruit {

	public Orange() {

	}

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}

	@Override
	public String taste() {
		return "sour";
	}

	public void juice() {
		System.out.println(getName() + " and having " + getWeight() + " extracting juice");
	}
}
