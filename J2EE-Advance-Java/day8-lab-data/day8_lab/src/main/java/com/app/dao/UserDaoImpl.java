package com.app.dao;

import org.apache.commons.io.FileUtils;
import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public class UserDaoImpl implements UserDao {

	@Override
	public String registerUser(User user) {
		// user : transient(neither associated with L1 cache nor in DB)
		String mesg = "Registration failed !!!!";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();

		// L1 cache is created -- EMPTY
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();

		try {
			// 3. Session API -- public void persist(Object o) throws HibExc
			session.persist(user); // user : persistent
			tx.commit();
			// rec will be inserted in db
			mesg = "User registered successfully , with ID =  " + user.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}

		// user - DETACHED (doesn't exist in L1 cache , BUT has DB identity)
		return mesg;
	}

		@Override
	public User authenticateUser(String email, String password) {
		User user = null;
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		// 1. get session from SF (get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", password)
					.getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exception to the caller
			throw e;
		}

		return user;
	}

	
}
