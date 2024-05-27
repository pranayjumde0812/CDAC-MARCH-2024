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

public class GetAllUserDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();) {
			// create user dao instance
			UserDao userDao = new UserDaoImpl();
			userDao.getAllUsers().forEach(System.out::println);
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
