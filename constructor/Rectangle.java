package com.constructor;

public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle() {
		this.length = 1;
		this.breadth = 1;
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int area() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 3);
		System.out.println("Default rectangle area: " + rect1.area());
		System.out.println("Custom rectangle area: " + rect2.area());
	}
}
