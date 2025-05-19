package com.company.app;

import com.company.hr.Employee;

import com.company.admin.Department;
public class CompanyApp 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setId(910018);
		e.setName("Indhu Reddy");
		e.setSalary(100000.00);

		Department d = new Department();
		d.setDeptName("Frontend Developer");
		d.setDeptId(1001);

		e.showEmployeeDetails();
		System.out.println();
		d.showDepartmentDetails();
	}
}
