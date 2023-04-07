package com.emonics.beans;

public class Book {
	private String bookName;
	private String isbn;
	
	public Book() {
		
	}
	
	public Book(String name, String isbn) {
		this.bookName = name;
		this.isbn = isbn;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
