package com.lib.service;

import java.util.List;

import com.lib.classes.Book;

public interface BookServiceInterface {

	public void addBook(Book book) throws Exception;

	public List<Book> getAllBook() throws Exception;

	public Book getByName(String Name) throws Exception;
	
}
