package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Pen {
	
	private int id;
	private Brand brand;
	private String color;
	private String Inkcolor;
	private Material material;
	private int stock;
	private LocalDate update_date;
	private LocalDate Listing_date;
	private double price;
	private double discount;
	private static int idGenerator = 1;

	//ctor
	public Pen(Brand brand, String color, String inkcolor, Material material, int stock, 
			LocalDate listing_date, double price, double discount) {
		super();
		
		this.brand = brand;
		this.color = color;
		Inkcolor = inkcolor;
		this.material = material;
		this.stock = stock;
		this.update_date = update_date.now();
		Listing_date = listing_date;
		this.price = price;
		this.discount = discount;
		this.id = idGenerator++;   // auto generate ID
	}


	//getters n setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkcolor() {
		return Inkcolor;
	}

	public void setInkcolor(String inkcolor) {
		Inkcolor = inkcolor;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(LocalDate update_date) {
		this.update_date = update_date;
	}

	public LocalDate getListing_date() {
		return Listing_date;
	}

	public void setListing_date(LocalDate listing_date) {
		Listing_date = listing_date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", Inkcolor=" + Inkcolor + ", material="
				+ material + ", stock=" + stock + ", update_date=" + update_date + ", Listing_date=" + Listing_date
				+ ", price=" + price + ", discount=" + discount + "]";
	}

	
	
	
	
	
	
	
	
	

}
