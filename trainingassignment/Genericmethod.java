package com.trainingassignment;

import java.util.Scanner;

public class Genericmethod {
	
	public static <C> Boolean isequalto (C x,C y)
	{
		if(x.equals(y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		public static void main(String[] args)
		{
			int a,b;
			Scanner input= new Scanner(System.in);
			System.out.println("Enter two integer values:");
		    a= input.nextInt();
			b= input.nextInt();
			if(isequalto(a,b)== true)
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
			}
		{
			
		Object ob = new Object();
		Object ob1 = new Object();
		Scanner sc = new Scanner(System.in);
		ob= sc.next();
		ob1= sc.next();
		if(isequalto(ob,ob1)== true)
		{
			System.out.println("true");
		}
		else
			
		System.out.println("false");
}
}

		
		
		
	
	


