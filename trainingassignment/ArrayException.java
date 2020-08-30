package com.trainingassignment;

public class ArrayException {
	
	public static void main(String[] args) {
		
		try
		{
			int a[]= new int[8];
			System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("Exception received");
	}

}
