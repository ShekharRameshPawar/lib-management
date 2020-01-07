package com.lib.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lib.classes.Book;
import com.lib.dao.DaoConnection;
import com.lib.dao.DaoInterface;

public class BookService implements BookServiceInterface {

	private DaoInterface dbConnection = new DaoConnection();

	@Override
	public List<Book> getAllBook() throws Exception {
		String sql = "select * from Book";
		ResultSet resultSet = dbConnection.excuteQueryCustom(sql);
		if (resultSet == null)
			throw new RuntimeException("Data is invalid");

		List<Book> bookList = new ArrayList<Book>();
		while (resultSet.next()) {

			Book book = new Book();
			book.setId(resultSet.getLong(1));
			book.setBname(resultSet.getString(2));
			bookList.add(book);
		}
		return bookList;
	}

	@Override
	public void addBook(Book book) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Book getByName(String Name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
