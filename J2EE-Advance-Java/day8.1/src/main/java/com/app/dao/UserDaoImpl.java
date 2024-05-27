package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
	public User getUserDetails(Long userId) {
		User user = null;// user - does not exist (in the java heap n not in L1 cache)
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get user details by it's id
			user = session.get(User.class, userId);// select * from users where id=?
			user = session.get(User.class, userId);
			user = session.get(User.class, userId);
			user = session.get(User.class, userId);
			// user - null (id doesn't exist) OR in case of valid id --
			// PERSISTENT (part of L1 cache , does have db identity)
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return user;// user - DETACHED | doesn 't exist
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		String jpql = "select u from User u";
		// 1. get session from SF (get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. Create Query object n execute the same
			/*
			 * Session API public Query<T> createQuery(String hql/jpql , Class<T> class)
			 * throws HibernateExc Query API to exec query List<T> getResultList();
			 * 
			 */
			users = session.createQuery(jpql, User.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exception to the caller
			throw e;
		}
		return users;
	}

	@Override
	public List<User> getAllUsersByDobAndRole(LocalDate start, LocalDate end1, Role role1) {
		List<User> users = null;
		String jpql = "select u from User u where u.dob between :begin and :end and u.role =:userRole";
		// 1. get session from SF (get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class) // Query : jpql
					.setParameter("begin", start)// 1st in param
					.setParameter("end", end1)// 2nd in param
					.setParameter("userRole", role1)// 3rd in param
					.getResultList();// exec query --> RST --> List of persistent entities !

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exception to the caller
			throw e;
		}
		return users;
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
	public String changePassword(String email, String oldPwd, String newPwd) {
		String mesg = "change pwd  failed";
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		User user = null;
		// 1. get session from SF (get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", oldPwd)
					.getSingleResult();// select
			// => valid login --> user : persistent
			user.setPassword(newPwd);// updating state of persistent entity
			// session.evict(user);//user : detached from l1 cache
			tx.commit();// update
			mesg = "pwd changed !";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exception to the caller
			throw e;
		}
		// user : DETACHED
		// user.setPassword("9999999999999");

		return mesg;
	}

	@Override
	public List<String> getFirstNamesByDateNRole(LocalDate start, LocalDate end, Role role) {
		List<String> names = null;
		String jpql = "select u.firstName from User u where u.dob between :start and :end and u.role=:role1";
		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			names = session.createQuery(jpql, String.class).setParameter("start", start).setParameter("end", end)
					.setParameter("role1", role).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return names;
	}

	@Override
	public List<User> getDetailsByDate(LocalDate start, LocalDate end) {
		List<User> users = null;
		String jpql = "select new com.app.entities.User(firstName,dob,phoneNo) from User u where u.dob between :start and :end";
		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).setParameter("start", start).setParameter("end", end)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return users;
	}

	@Override
	public String applyDiscount(LocalDate date1, Role role1, double amount1) {
		String mesg = "updation failed";
		String jpql = "update User u set u.regAmount=u.regAmount-:discount where u.regDate < :date and u.role=:role";

		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			int rows = session.createQuery(jpql).setParameter("discount", amount1).setParameter("date", date1)
					.setParameter("role", role1).executeUpdate();
			tx.commit();
			mesg = "Reg amount discounted for " + rows + " no of users....";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String unsubscribeUser(Long userId) {
		String mesg = "deletion failed";
		User user = null;// does not exist in heap
		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. Get user from its id
			user = session.get(User.class, userId);
			if (user != null) {
				// user - persistent
				// delete user details
				session.delete(user); // user - removed
				mesg = "deleted user details , for user name" + user.getLastName();
			}
			tx.commit();// delete , session.close
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		// user - transient
		return mesg;
	} // after method rets user : marked for GC

	@Override
	public String storeImage(String email, String fileName) throws IOException {
		String mesg = "storing image failed!!!!!!!!";
		String jpql = "select u from User u where u.email=:em";
		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get user by its email
			User user = session.createQuery(jpql, User.class).setParameter("em", email).getSingleResult();
			// user : persistent
			// 4 Create java.io.File class instance to represent the file path
			File file = new File(fileName);
			if (file.isFile() && file.canRead()) {
				// readable file
				user.setImage(FileUtils.readFileToByteArray(file));// modifying state of the persistent
				mesg = "stored image file ...";
			} else {
				System.out.println("invalid file name");
			}
			tx.commit();// DML -- update
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String restoreImage(String email, String fileName) throws IOException {
		String mesg = "restoring image failed!!!!!!!!";
		String jpql = "select u from User u where u.email=:em";
		// 1. get Session from SessionFactory (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get user by its email
			User user = session.createQuery(jpql, User.class).setParameter("em", email).getSingleResult();
			// user : persistent (exists)
			// chk if image exists
			byte[] imgData = user.getImage();
			if (imgData != null) {
				FileUtils.writeByteArrayToFile(new File(fileName), imgData);
				mesg = "Restored image from DB !";
			}

			tx.commit();// DML -- update
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
