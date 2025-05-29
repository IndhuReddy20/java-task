package com.inheritancetask;

class Employee {
    String name;
    double baseSalary;
    
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public double calculateAnnualSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;
    int numberOfEmployeesManaged;
    
    public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
        super(name, baseSalary);
        this.bonus = bonus;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }
    
    public double calculateAnnualSalary() {
        return baseSalary+bonus;
    }
    
    public double calculateManagerSalary() {
        return baseSalary + bonus;
    }
}

class Engineer extends Employee {
    int projectCount;
    
    public Engineer(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }
    
    public double calculateAnnualSalary() {
        return baseSalary + (projectCount * 1000);
    }
    
    public double calculateEngineerSalary() {
        return baseSalary + (projectCount * 1000);
    }
}

class Salesperson extends Employee {
    double commissionRate;
    private double totalSales;
    
    public Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    
    public double calculateAnnualSalary() {
        return baseSalary + (commissionRate * totalSales);
    }
    
    public double calculateSalespersonSalary() {
        return baseSalary + (commissionRate * totalSales);
    }
}


public class Task2 {
	public static void main(String[] args) {
		Employee manager = new Manager("Alice", 50000, 10000, 5);
		System.out.println(manager.calculateAnnualSalary());
		System.out.println(((Manager)manager).calculateManagerSalary()); 
		System.out.println();
		Employee engineer = new Engineer("Bob", 70000, 5);
		System.out.println(engineer.calculateAnnualSalary());
		System.out.println(((Engineer) engineer).calculateEngineerSalary());
		System.out.println();
		Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
		System.out.println(salesperson.calculateAnnualSalary());
		System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
	}
}
