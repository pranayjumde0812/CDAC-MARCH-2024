package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;

public class DeleteCategoryDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CategoryDao dao = new CategoryDaoImpl();
			System.out.println("Enter category id ");
			
			System.out.println(dao.deleteCategoryDetails(sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
