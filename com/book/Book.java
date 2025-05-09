package com.book;

public class Book {
	private String title;
	private String author;
	private double price;

public void setBookDetails(String t , String a , double p) {
	
	title = t;
	author = a;
	price = p;
}
public void getBookDetails() {
	System.out.println("Book Title      : " + title);
	System.out.println("Author          : " + author);
    System.out.println("Price           : " + price);

}

}
