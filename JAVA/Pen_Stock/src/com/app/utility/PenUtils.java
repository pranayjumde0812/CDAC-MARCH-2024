package com.app.utility;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Map;

import com.app.entity.Pen;
import com.app.exceptions.PenException;

public class PenUtils {
	
	public static Pen updateStock(int id,Map<Integer,Pen>map) throws PenException
	{
		Pen p = map.get(id);
		if(p==null)
			throw new PenException("Invalid ID!!!! Please try again...");
		return p;
		
	}
	
	public static String discount(Map<Integer, Pen>map)
	{
		for(Pen p:map.values())
		if(Period.between(p.getListing_date(),LocalDate.now()).getMonths()>=3)
		{
			p.setDiscount(20);
		}
		return  "discount of 20% for all the pens which are not at all sold in last 3 months";
		
		
	}
	
	public static void removePen(Map<Integer,Pen> map)
	{
		
		Iterator<Pen> itr = map.values().iterator();
		while(itr.hasNext())
		{
			Pen p = itr.next();
			if((Period.between(p.getListing_date(),LocalDate.now()).toTotalMonths())>=9)
			itr.remove();
			
		}
		
	}

}
