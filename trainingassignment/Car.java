package com.trainingassignment;

public class Car extends Vehicle{
	
	Car(String n, int m)
	{
		super(n,m);
	}
	void display()
	{
		
	System.out.println("The car is:");
	super.display();
		
	}

}
