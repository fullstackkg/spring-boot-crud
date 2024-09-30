package com.practice.simple_crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	@GetMapping(value="/books")
	public String getBooks(@RequestParam String username, @RequestParam String email) {
		System.out.print("This is the username: " + username);
		System.out.print("This is the email: " + email);
		return "bookpage";
	}
}
