package com.main3;

import com.book.Book;
import com.publisher.Publisher;

public class Main3 {
	public static void main(String[] args) {
		Publisher publisherObject=Publisher.getPublisherObject("Indhu", "hyd", "PUB12320");
		Book bookObject=Book.getBookObject("My Heart", "Sindhu", publisherObject, 500);
		if(bookObject==null && publisherObject==null) {
			System.out.println("Book Creation is failed due to invalid data");
		}
		else {
			System.out.println(publisherObject);
			System.out.println(bookObject);
		}
	}
}
