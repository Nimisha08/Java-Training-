package com.trainingassignment;

public class Employeedetails {

	public static void main(String[] args) 
	{
		Employe d1= new Employe();
		Employe d2= new Employe();
		
		System.out.println("Yearly salary");
		d1.setFirstname("Mini");
		d1.setLastname("Jim");
		d1.setMonthlysal(20000);
		System.out.println(d1.firstname + d1.lastname+d1.monthlysal*12);
		
		d2.setFirstname("Kini");
		d2.setLastname("lini");
		d2.setMonthlysal(40000);
		System.out.println(d2.firstname
				+ d2.lastname+d2.monthlysal*12);
		
		System.out.println("Raised 10% yearly salary");
		System.out.println(d1.firstname
				+ d1.lastname+d1.monthlysal*1.1*12);
		System.out.println(d2.firstname
				+ d2.lastname+d2.monthlysal*1.1*12);
		
		}
}
