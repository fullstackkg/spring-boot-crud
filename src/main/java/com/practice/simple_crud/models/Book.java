package com.practice.simple_crud.models;

public class Book {
	private String title;
	private Integer year;
	
	public Book(String title, Integer year) {
		this.title = title;
		this.year = year; 
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	} 
	
	
}
