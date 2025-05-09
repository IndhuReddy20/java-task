package com.product;

public class Product {
	private String productName;
	private int productId;
	private double price;
	public void setProdutDetails(String name,int id,double prc) {
		productName=name;
		productId=id;
		price=prc;
	}
	public void getProductDetails() {
		System.out.println("Product Name  :"+productName+"\nProduct ID    :"+productId+"\nProduct Price :"+price);
		

	}

}
