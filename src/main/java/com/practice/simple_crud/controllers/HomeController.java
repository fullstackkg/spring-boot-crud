package com.practice.simple_crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//This let's Spring Boot know that this class is a controller 
@Controller
public class HomeController {
	@GetMapping(value = "/") 
	public String showHomePage() {
		return "homepage";
	}
}
