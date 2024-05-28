package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Address;
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

		@Override
		public String assignAddress(Address address, Long userId) {
			String mesg="assigning address failed";
			// 1. get session from SF (getCurrentSession)
			Session session=getFactory().getCurrentSession();
			//2. Begin a Tx
			Transaction tx=session.beginTransaction();
			try {
				//1. get user from it's id
				User user=session.get(User.class, userId);
				if(user != null)
				{
					//=> user : persistent
					//establish uni dir asso user --> address
					user.setMyAddress(address);//address : transient
					session.persist(address);//address : persistent
					//added session.persist here explicitly to ret adr id to the user n not for inserting a rec.
					mesg="assigned address details to the user , address id "+address.getId();
					
				}
				//what will happen if u add commit in above if branch ?? connection leak error
				tx.commit();
			} catch (RuntimeException e) {
				if(tx != null)
					tx.rollback();
				//re throw the exc to the caller
				throw e;
			}
			return mesg;
		}

		@Override
		public List<User> getUserNamesByCity(String city1) {
			List<User> users=null;
			String jpql="select new com.app.entities.User(firstName,lastName) from User u where u.myAddress.city=:city";
			// 1. get session from SF (getCurrentSession)
			Session session=getFactory().getCurrentSession();
			//2. Begin a Tx
			Transaction tx=session.beginTransaction();
			try {
				users=session.createQuery(jpql,User.class)
						.setParameter("city", city1)
						.getResultList();
				tx.commit();
			} catch (RuntimeException e) {
				if(tx != null)
					tx.rollback();
				//re throw the exc to the caller
				throw e;
			}
			return users;
		}
		
		

	
}
