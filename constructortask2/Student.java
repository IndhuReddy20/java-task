package com.constructortask2;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void updateDetails(String name) {
		String oldName = this.name;
		this.name = name;
		System.out.println("Old name: " + oldName);
		System.out.println("New name: " + this.name);
	}

	public void display() {
		System.out.println("Roll No: " + this.rollNo);
		System.out.println("Name: " + this.name);
	}

	public static void main(String[] args) {
		Student student = new Student(125, "Indhu");
		student.display();
		student.updateDetails("Indhu Reddy");

	}
}
