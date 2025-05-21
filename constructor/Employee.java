package com.constructor;

public class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Sindhu", 50000);
		Employee emp2 = new Employee("Bindhu", -1000);
		System.out.println("Employee 1:");
		emp1.displayDetails();
		System.out.println("Employee 2:");
		emp2.displayDetails();

	}
}
