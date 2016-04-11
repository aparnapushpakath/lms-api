package com.aparna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aparna.dao.UserDAO;
import com.aparna.model.User;

public class App {
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = 
    	  new ClassPathXmlApplicationContext("spring/spring.xml");
	
    	UserDAO userdao = context.getBean(UserDAO.class);
    	
    	/** insert **/
    	User user1 = new User();
    	user1.setFirstname("aaa");
   user1.setLastname("bbb");
  user1.setPhone("223344");
  userdao.saveUser(user1);
  
    	
    
    	
    	System.out.println("Done");
    }
}