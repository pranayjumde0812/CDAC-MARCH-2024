package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;
import static java.time.LocalDate.parse;
import static com.app.entities.Role.valueOf;

public class GetUserDetailsByDateNRole {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao userDao = new UserDaoImpl();
			System.out.println("Enter start , end date n role");
			System.out.println("Selected user list -");
			userDao.getAllUsersByDobAndRole(parse(sc.next()), parse(sc.next()), valueOf(sc.next().toUpperCase()))
					.forEach(System.out::println);
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
