package com.app.tester;

import static com.app.entities.Role.valueOf;
import static com.app.utils.HibernateUtils.getFactory;
import static java.time.LocalDate.parse;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Address;
import com.app.entities.User;

public class AssignUserAddress {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao userDao = new UserDaoImpl();
			System.out.println("Enter address details - adrLine1,  adrLine2,  city,  state,  country,  zipCode");
			Address address = new Address(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println("Enter user id , to assign address");
			System.out.println(userDao.assignAddress(address, sc.nextLong()));
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
