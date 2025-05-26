package com.main1;

import com.school1.School;
import com.student.Student;

public class Main {
public static void main(String[] args) {
	School schoolObject=School.getschoolObject("SRM High School","Kodad","Learn by Understanding");
	Student studentObject=Student.getStudentObject("Indhu", "A+", schoolObject, 98);
	if(schoolObject==null && studentObject==null) {
		System.out.println("Enter all the details properly");
	}
	else {
		System.out.println(schoolObject);
		System.out.println(studentObject);
	}
}
}
