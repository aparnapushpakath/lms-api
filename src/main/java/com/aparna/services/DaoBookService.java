package com.aparna.services;

import java.util.List;

import com.aparna.model.Book;

public interface DaoBookService {
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Book book);
	public Book getBook(String isdn);
	public List<Book> getAllBooks();
}
