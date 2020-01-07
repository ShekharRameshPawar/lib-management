package com.lib.main;

import java.util.List;
import java.util.Scanner;

import com.lib.classes.Book;
import com.lib.classes.IssueBook;
import com.lib.service.BookService;
import com.lib.service.BookServiceInterface;
import com.lib.service.IssueBookInterface;
import com.lib.service.IssueBookService;

public class LibMain {

	public static void main(String[] args) throws Exception {

		Scanner sr=new Scanner(System.in);
		
		BookServiceInterface bookService = new BookService();
		List<Book> allBook = bookService.getAllBook();
		
		for (Book book : allBook) {
			System.out.println(book);
		}
		
		
		
		System.out.println("Enter Bid");
		Long bid=sr.nextLong();
		
		Book issueBookId=null;
		for (Book book2 : allBook) {
			if(book2.getId().equals(bid)) {
				issueBookId=book2;
				break;
			}
		}
		
		IssueBookInterface bookInterface=new IssueBookService();
		
		
		if(issueBookId != null) {

			IssueBook i1=new IssueBook();
			i1.setBid(issueBookId);
			Boolean bookAllocate = bookInterface.bookAllocate(i1);
			//bookAllocate.compareTo(Boolean.TRUE)?System.out.println("su"):System.out.println("fuck");
		}
		
		
	}

}
