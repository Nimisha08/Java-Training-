package com.trainingassignment;

import java.util.Scanner;

public class TemperatureConversion {
	
public static void main(String[] args) {
	
	int choice;
	double fahrenheit;
	double ce;
	double fa;
	double celcius;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choice:");
	choice= sc.nextInt();
	
	switch(choice)
	
	{
	case 1:
		System.out.println("Enter Fahrenheit temperature:");
	    fahrenheit= sc.nextDouble();
	    ce=5/9*(fahrenheit-32);
	    System.out.println("Celcius"+ce);
	    break;
	case 2:
		System.out.println("Enter celcius temperature:");
		celcius= sc.nextDouble();
		fa=9/5*(celcius+32);
		System.out.println("fahrenheit"+fa);
		break;
		default:
		System.out.println("Enter correct choice");
	}
	
}
			
	
}
	
	


