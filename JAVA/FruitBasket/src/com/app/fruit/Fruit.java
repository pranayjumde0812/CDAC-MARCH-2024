package com.app.fruit;

public abstract class Fruit {
	private String color;
	private String name;
	private double weight;
	private boolean isFresh;

	public Fruit() {

	}

	public Fruit(String name, String color, double weight) {

		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = true;
	}

	public abstract String taste();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public boolean isFresh() {
		return isFresh;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Color : " + color + ", Weight : " + weight;
	}
}
