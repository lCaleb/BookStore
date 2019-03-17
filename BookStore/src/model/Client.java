package model;

import java.util.PriorityQueue;

import MCLibrary.MList;

public class Client {

	private String id;
	private MList<String> isbnList;
	private PriorityQueue<Book> bookList;
	private int minutes;
	
	public Client(String id) {
		this.id= id;
		isbnList= new MList<String>();
		minutes=1;
	}
	
	
	
}
