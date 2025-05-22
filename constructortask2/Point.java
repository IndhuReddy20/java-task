package com.constructortask2;

public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x + ", " + this.y);
		System.out.println(this);
	}

	public static void main(String[] args) {
		Point point1 = new Point(5, 10);
		point1.print();
	}
}
