package model;

public class Book implements Comparable<Book> {

	
	private String title;
	private String ISBN;
	private double price;
	private int quantity;
	private boolean soldOut; 
	
	private char bookShelve;
	
	
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

	@Override
	public int compareTo(Book b) {
        if (bookShelve < b.getBookShelve()) {
            return 1;
        } else if (bookShelve > b.getBookShelve()) {
            return -1;
        } else {
            return 0;
        }

	}

	public char getBookShelve() {
		return bookShelve;
	}

	public void setBookShelve(char bookShelve) {
		this.bookShelve = bookShelve;
	}
	
	
	
	
}
