package com.pracetice.simple_crud.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.practice.simple_crud.models.Book;

//This class is used to manage books 
@Service
public class BookService {
	private final static List<Book> BOOKLIST;

	static {
		BOOKLIST = new ArrayList<Book>();
		BOOKLIST.add(new Book("This is book 1", 2022));
		BOOKLIST.add(new Book("This is book 2", 2013));
		BOOKLIST.add(new Book("This is book 3", 2000));
		BOOKLIST.add(new Book("This is book 4", 1999));
	}

	public List<Book> getAllBooksByLogin(String login) {
		if (login != null) {
			return BOOKLIST;
		}
		
		return BOOKLIST.stream().filter(book -> book.getYear() > 2000).toList();
	}
}
