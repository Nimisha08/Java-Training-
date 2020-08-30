package com.trainingassignment;

public class ArithmeticExcep {
	
	public static void main(String[] args) {
		try {
			int a= 4/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		
			System.out.println("Exception Received");
		}
	}


