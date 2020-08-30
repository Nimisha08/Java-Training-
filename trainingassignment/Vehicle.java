package com.trainingassignment;

public class Vehicle {
	
	String  name;
	int modelnumber;
	
	Vehicle(String n, int m)
	{
		name= n;
		modelnumber= m;
	}
	void display()
	{
		System.out.println("Name:"+ "" +name);
		System.out.println("Model:"+ "" + modelnumber);
		
	}

}
