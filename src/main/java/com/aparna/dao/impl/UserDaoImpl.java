package com.aparna.dao.impl;

import java.util.List;

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

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	Session session= null;
	Transaction transaction=null;
	
	

	@Override
	public void saveUser(User user) {
		session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  session.save(user);  
		  transaction.commit();  
		  session.close();
	
	}

	@Override
	public void deleteUser(User user) {
		session.delete(user);
	}

	@Override
	public List<User> getUser(int id) {
		 session = sessionFactory.openSession();  
		  transaction = session.beginTransaction();  
		  List<User> userList = session.createCriteria(User.class)  
		    .list();  
		  transaction.commit();  
		  session.close();  
		  return userList;  
		 }  

}
