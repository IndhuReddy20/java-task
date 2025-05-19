package com.school.app;

import com.school.management.School;
import com.school.staff.Principal;

public class SchoolApp {
	public static void main(String[] args) 
	{
		
		School school = new School();
		school.setName("SRM");
		school.setLocation("Kodad");


		Principal principal = new Principal();
		principal.setprincipalName("Sridevi Mam");
		principal.setexperienceYears(5);

		school.showSchoolInfo();
		System.out.println();
		principal.showPrincipalInfo();
}

}
