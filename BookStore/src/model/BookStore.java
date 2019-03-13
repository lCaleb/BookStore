package model;

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
	
	
	public Stack<Book> locationsList(MList<String> isbnList){
		
		Stack<Book> locationList= new Stack<Book>();
		
		while (!isbnList.isEmpty()) {
			locationList.push(catalog.chainingSearch(isbnList.poll()).value);
		}
		
		return locationList;	
	}
	
	public void
	
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
