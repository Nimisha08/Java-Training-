package com.trainingassignment;

import java.util.Scanner;

public class Salarycalcmain {
	
	public static void main(String[] args) {
		String name;
		int hour;
		double rate;
		
		Scanner sc = new Scanner(System.in);
		Salarycalc cal=new Salarycalc();
		System.out.println("Emplyoee Name:");
		name=sc.next();
		cal.setEmployee_name(name);
		
		System.out.println("Hours worked:");
		hour=sc.nextInt();
		cal.setHours(hour);
		
		System.out.println("Rate:");
		rate=sc.nextDouble();
		cal.setRate(rate);
		cal.pay(hour,rate);
		cal.diaplayemployee();
	}
}


		
		
		
		
		
		
		
				
		
		
		
		
	


