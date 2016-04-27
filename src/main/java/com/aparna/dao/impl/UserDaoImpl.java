package com.aparna.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.aparna.dao.UserDAO;
import com.aparna.model.User;
import com.aparna.utils.DatabaseConnector;

public class UserDaoImpl  implements UserDAO {

	private SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session session= null;
	Transaction transaction=null;



	@Override
	public void updateUser(User user) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		session.update(user);  
		transaction.commit();  
		session.close();
	}

	@Override
	public void deleteUser(User user) {
		session = sessionFactory.openSession();
		if(user!=null)
			session.delete(user);
		logger.info("Person deleted successfully user details="+user);
	}

	@Override
	public User getUser(int id) {
		session = sessionFactory.openSession();  
		User user = (User) session.get(User.class, id);
		return user;
		/*	 session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  List<User> userList = session.createCriteria(User.class)  
		    .list();  
		  transaction.commit();  
		  session.close();  */
		// return userList;  
	}

	@Override
	public void addUser(User user) {
		session = sessionFactory.openSession();  
		session.save(user); 
		session.close(); 

	}

	@Override
	public List<User> getAllUsers() {
		session = sessionFactory.openSession();  
		List<User> userList= session.createQuery("from User").list();
		for(User u : userList){
			logger.info("\nUsers List::"+u.toString());
		}

		return userList;
	}  

}
