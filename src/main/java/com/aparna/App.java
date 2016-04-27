package com.aparna;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aparna.dao.BookDao;
import com.aparna.dao.UserDAO;
import com.aparna.model.Book;
import com.aparna.model.User;

public class App {
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = 
    	  new ClassPathXmlApplicationContext("spring/spring.xml");
	
    	BookDao bookdao = context.getBean(BookDao.class);
    	
    	/** insert **/
    	/*User user1 = new User();
    	user1.setFirstname("zzzzaa");
  user1.setLastname("bbb");
 user1.setPhone("29944");
 userdao.addUser(user1);*/
  
  //  user1=userdao.getUser(1);	
  //  List<User> user=userdao.getAllUsers();
   // System.out.println(user.toString());
   
 // Book book1= new Book("cat","dr seuss", "s663");
 // bookdao.addBook(book1);
    
    	System.out.println(bookdao.getAllBooks());
    	System.out.println("Done");
    }
}