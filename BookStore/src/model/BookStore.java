package model;

import java.util.PriorityQueue;
import java.util.Queue;

import MCLibrary.CMHashTable;
import MCLibrary.MList;
import MCLibrary.MQueue;
import MCLibrary.Stack;

public class BookStore {
	
	private CMHashTable<String, Book> catalog;
	private MQueue<Client> clients;
	private MList<Seller> sellers;
	
	public BookStore() {
		catalog= new CMHashTable<String, Book>();
		clients= new MList<Client>();
		sellers= new MList<Seller>();
		
	}
	
	
	public PriorityQueue<Book> locationsList(MList<String> isbnList){
		
		//Stack<Book> locationList= new Stack<Book>();
		PriorityQueue<Book> locations = new PriorityQueue<Book>();
		
		while (!isbnList.isEmpty()) {
			locations.offer(catalog.chainingSearch(isbnList.poll()).value);
		}
		
		return locations;	
	}
	
	public Stack<Book> collectBooks(PriorityQueue<Book> collect) {
		Stack<Book> collected= new Stack<Book>();	
		
		while (!collect.isEmpty()) {
			collected.push(collect.poll());
		}
				
		return collected;
	}
	
	
	public void addBook(Book book) {
		catalog.addChainingFunction(book.getISBN(), book);
	}
	
	public void addClient(Client client) {
		clients.offer(client);
	}
	public void addSeller(Seller seller) {
		sellers.add(seller);
	}


	public CMHashTable<String, Book> getCatalog() {
		return catalog;
	}


	public void setCatalog(CMHashTable<String, Book> catalog) {
		this.catalog = catalog;
	}


	public MQueue<Client> getClients() {
		return clients;
	}


	public void setClients(MQueue<Client> clients) {
		this.clients = clients;
	}


	public MList<Seller> getSellers() {
		return sellers;
	}


	public void setSellers(MList<Seller> sellers) {
		this.sellers = sellers;
	}
	
	

}
