package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.Category;

public class AddNewCategory {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CategoryDao dao = new CategoryDaoImpl();
			//for testing - do not add any white space
			System.out.println("Enter category details - name n desc");
			Category cat = new Category(sc.next(),sc.next());
			System.out.println(dao.addNewCategory(cat));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
