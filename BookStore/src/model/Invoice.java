package model;

import MCLibrary.MCStack;

public class Invoice {
	
	private double  total;
	private MCStack<Book> books;
	
	public Invoice() {
		
	}
	
	public void  addBook(Book book) {
		books.push(book);
		total+= book.getPrice();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public MCStack<Book> getBooks() {
		return books;
	}

	public void setBooks(MCStack<Book> books) {
		this.books = books;
	}
	
	
}
