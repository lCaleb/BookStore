package model;

import java.util.PriorityQueue;

import MCLibrary.MCStack;
import MCLibrary.MList;

public class Client {

	private String id;
	private MList<String> isbnList;
	private MCStack<Book> bookList;
	private int minutes;
	private Invoice invoice;
	
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Client(String id) {
		this.id= id;
		isbnList= new MList<String>();
		minutes=1;
	}
	
	 public void addList(Book book) {
		 isbnList.add(book.getISBN());
	 }
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MList<String> getIsbnList() {
		return isbnList;
	}

	public void setIsbnList(MList<String> isbnList) {
		this.isbnList = isbnList;
	}

	public MCStack<Book> getBookList() {
		return bookList;
	}

	public void setBookList(MCStack<Book> bookList) {
		this.bookList = bookList;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes += minutes;
	}
	
	
	
	
	
}
