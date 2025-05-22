package com.constructortask2;

public class Employee {
	 String name;
	 double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Salary: " + this.salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Indhu", 50000.0);
		emp.display();

		emp.setSalary("Sindhu", 60000.0);
		emp.display();
	}
}
