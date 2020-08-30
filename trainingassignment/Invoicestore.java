package com.trainingassignment;

public class Invoicestore {
	
	public static void main(String[] args)
	{
		Invoice screws= new Invoice("7898", "screws",10, -30);
		Invoice bolts= new Invoice("7898", "bolts",-20, 40);
		System.out.println(screws.getPartnumber());
		System.out.println(screws.getPartdescription());
		System.out.println(screws.getQuantity());
		System.out.println(screws.getPrice());
		System.out.println(bolts.getPartnumber());
		System.out.println(bolts.getPartdescription());
		System.out.println(bolts.getQuantity());
		System.out.println(bolts.getPrice());

	
}

}
