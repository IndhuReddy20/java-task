package com.constructor;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(6);
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Circle circumference: " + circle.getCircumference());
	}
}
