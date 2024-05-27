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
/*
 * Sample data
 * a1 b1 a1@gmail.com 1234 1990-10-20 345678909 admin 0
 * a2 b2 a2@gmail.com 2234 1991-10-20 675678909 blogger 1000
 */
public class RegisterUserwithRegAmount {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)) {
			//create user dao instance
			UserDao userDao=new UserDaoImpl();
			System.out
					.println("Enter user details - firstName,  " + "lastName,  email,  password,  dob,  phoneNo, role reg amount");
			User transientUser = new User(sc.next(), sc.next(), sc.next(), sc.next(), parse(sc.next()), sc.next(),
					valueOf(sc.next().toUpperCase()),sc.nextDouble());
			
			System.out.println(userDao.registerUser(transientUser));
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
