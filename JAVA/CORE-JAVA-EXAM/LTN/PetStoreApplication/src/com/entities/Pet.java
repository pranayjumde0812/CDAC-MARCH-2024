package com.entities;

public class Pet {
//	Pet ( petId, name, category, unitPrice, stocks)
	private int petId;
	private String name;
	private Category category;
	private double unitPrice;
	private int stock;

	public Pet() {

	}

	public Pet(int petId, String name, Category category, double unitPrice, int stock) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stocks) {
		this.stock = stocks;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stock=" + stock + "]";
	}

}
