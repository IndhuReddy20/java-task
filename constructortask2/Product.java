package com.constructortask2;

public class Product {
	int id;
	double price;

	public Product(int id, double price) {
		this.id = id;
		this.price = price;
	}

	public boolean isSame(Product p) {
		return this.id == p.id;
	}

	public static void main(String[] args) {
		Product product1 = new Product(101, 25.99);
		Product product2 = new Product(101, 30.50);
		Product product3 = new Product(102, 25.99);

		System.out.println("Product1 same as Product2: " + product1.isSame(product2)); 
		System.out.println("Product1 same as Product3: " + product1.isSame(product3));
	}
}
