package com.app.utility;

import java.time.LocalDate;

import com.app.entity.Brand;
import com.app.entity.Material;
import com.app.entity.Pen;

public class PenValidations {

	public static Pen validateInputs(String brand,String color,String Inkcolor,String material,
	 int stock,String Listing_date,double price,double discount) 
	{
		Brand brand1 = parseAndValidateBrand(brand);
		Material material1 = parseAndValidateMaterial(material);
		LocalDate ldate = parseListingDate(Listing_date);
		
		
		return new Pen(brand1,color,Inkcolor,material1,stock,ldate,price,discount);
	
	}
	
	public static Brand parseAndValidateBrand(String brand)
	{
		return Brand.valueOf(brand.toUpperCase());
		
	}
	
	public static Material parseAndValidateMaterial(String material)
	{
		return Material.valueOf(material.toUpperCase());
		
	}
	
	
	public static LocalDate parseListingDate(String Listing_date)
	{
		
		return LocalDate.parse(Listing_date);
	}
	
	

}
