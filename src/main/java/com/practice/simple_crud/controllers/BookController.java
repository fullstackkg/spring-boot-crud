package com.practice.simple_crud.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pracetice.simple_crud.services.BookService;
import com.practice.simple_crud.models.Book;

@Controller
public class BookController {
	private final BookService bookService = new BookService();

	@GetMapping(value = "/books")
	public String getBooks(@RequestParam(required = false) String login, @RequestParam(required = false) String email,
			Model model) {
		List<Book> userBooks = bookService.getAllBooksByLogin(login);

		model.addAttribute("userBooks", userBooks);
		return "bookpage";
	}

}
