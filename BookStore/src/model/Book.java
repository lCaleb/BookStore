package model;

public class Book {

	
	private String title;
	private String ISBN;
	private double price;
	private int quantity;
	private boolean soldOut; 
	
	public Book(String title, String iSBN, double price) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.price = price;
		setSoldOut(false);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isSoldOut() {
		return soldOut;
	}
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
	
	
	
}
