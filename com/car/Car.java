package com.car;

public class Car {
	private String model;
	private String company;
	private double price;

	public void setCarDetails(String m, String c, double p) {

		model = m;
		company = c;
		price = p;
	}

	public void getCarDetails() {
		System.out.println("Car Model      : " + model);
		System.out.println("Company        : " + company);
		System.out.println("Car Price      : " + price);
	}

}
