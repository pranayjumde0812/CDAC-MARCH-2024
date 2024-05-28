package com.app.tester;

import static com.app.entities.Role.valueOf;
import static com.app.utils.HibernateUtils.getFactory;
import static java.time.LocalDate.parse;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.User;

public class RegisterUser {

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
