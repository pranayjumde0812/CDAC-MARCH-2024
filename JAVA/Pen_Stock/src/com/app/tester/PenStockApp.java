package com.app.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Pen;
import com.app.utility.PenUtils;
import com.app.utility.PenValidations;

public class PenStockApp {

	public static void main(String[] args) {
		
		//try with resources
		try(Scanner sc = new Scanner(System.in))
		{
			
			boolean exit = false;
			
			Map<Integer, Pen> map = new HashMap<>(); 
			
			while(!exit)
			{
				System.out.println("1. Add new pen \n"+"2. Display all pen \n"+"3. Update stock of a pen \n"+"4.20% discount for not sold in last 3 months \n"
						+"5.Remove pens never sold in last 9 months \n"+"6.Exit\n");
				System.out.println("Enter the choice:");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter the pen details:brand,color,Inkcolor,material,stock,listing_date,price,discount");
						
						Pen pen = PenValidations.validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(),sc.nextDouble());
						
						map.put(pen.getId(), pen);
						
						System.out.println("Adding pen successfully!!!!");
						
						break;
						
					case 2:
						System.out.println("Display all details");
						for(Pen p:map.values())
							System.out.println(p);
						break;
						
					case 3:
						System.out.println("Enter the id whose stock wants to update");
						Pen pen1 = PenUtils.updateStock(sc.nextInt(),map);
						System.out.println("Enter new stock");
						pen1.setStock(sc.nextInt());
						System.out.println("Stock updated successfully...");
						
						break;
						
					case 4:
						
						String pen2 = PenUtils.discount(map);
						System.out.println("discount of 20% for all the pens which are not at all sold in last 3 months");
						break;
						
					case 5:
						PenUtils.removePen(map);
						System.out.println("Details of pen which are not sold from last 9 months are removed successfully!!!");
						break;
						
					case 6:
						exit = true;
						break;
					
					}
					
					
				}catch(Exception e)
				{
					sc.nextLine();
					System.out.println(e);
				}
				
			}
		}

	}

}
