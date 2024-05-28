package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.Category;

public class GetCategoryDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CategoryDao dao = new CategoryDaoImpl();
			
			System.out.println("Enter category name to search");			
			Category category=dao.getCategoryDetails(sc.next());
			System.out.println(category);		
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
