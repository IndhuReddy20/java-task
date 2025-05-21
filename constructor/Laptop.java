package com.constructor;

import java.util.Scanner;

public class Laptop {
	private String brand;
	private int ramSize;

	public Laptop(String brand, int ramSize) {
		this.brand = brand;
		this.ramSize = ramSize;
	}

	public void showSpecs() {
		System.out.println("Brand: " + brand);
		System.out.println("RAM Size: " + ramSize + " GB");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter laptop brand: ");
		String brand = scanner.nextLine();
		System.out.print("Enter RAM size (GB): ");
		int ramSize = scanner.nextInt();
		Laptop laptop1 = new Laptop(brand, ramSize);
		Laptop laptop2 = new Laptop("Acer", 16);

		System.out.println("User input laptop:");
		laptop1.showSpecs();
		System.out.println("Hardcoded laptop:");
		laptop2.showSpecs();
		scanner.close();
	}
}
