package com.app.fruit;

public class Mango extends Fruit {

	public Mango() {

	}

	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	}

	@Override
	public String taste() {

		return "sweet";
	}

	public void pulp() {
		System.out.println(getName() + " is " + getColor() + " and creating pulp");
	}
}
