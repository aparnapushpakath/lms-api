package com.aparna.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aparna.dao.BookDao;
import com.aparna.model.Book;


public class BookDaoImpl implements BookDao{
	private SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(BookDaoImpl.class);
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session session= null;
	Transaction transaction=null;

	@Override
	public void addBook(Book book) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction(); 
		session.save(book);
		transaction.commit();  
		System.out.println(session+"saved"+book.toString());
		session.close(); 

	}

	@Override
	public void updateBook(Book book) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		session.update(book);  
		transaction.commit();  
		session.close();

	}

	@Override
	public void deleteBook(Book book) {
		session = sessionFactory.openSession();
		if(book!=null)
			session.delete(book);
		logger.info("Book deleted="+book);
	}

	@Override
	public Book getBook(String isdn) {
		session = sessionFactory.openSession();  
		Book book = (Book) session.get(Book.class, isdn);
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		session = sessionFactory.openSession();  
		List<Book> bookList= session.createQuery("from Book").list();
		for(Book b : bookList){
			logger.info("\nbooks List::"+b.toString());
		}

		return bookList;
	}

}
