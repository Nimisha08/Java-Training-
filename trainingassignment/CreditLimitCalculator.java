package com.trainingassignment;

import java.util.Scanner;

public class CreditLimitCalculator {
	
	public static void main(String[] args) 
	{
	int account=1;
	int creditlimit = 0;
	int newbalance,credits,charges,beginingbal;
	
	Scanner sc= new Scanner(System.in);
	
	while(account!=0)
	{
		System.out.println("Account Number=");
		account=sc.nextInt();
		System.out.println("Balance Amount=");
		beginingbal=sc.nextInt();
		System.out.println("Charges=");
		charges=sc.nextInt();
		System.out.println("Total Credits=");
		credits=sc.nextInt();
		System.out.println("Credit Limit=");
		creditlimit=sc.nextInt();
		
		newbalance= beginingbal+ charges-credits;
		System.out.println( "New Balance="+newbalance);
		
		
		if(newbalance>creditlimit)
		{
			System.out.println("Credit Limit Exceeded");
			break;
		}
	}
	
		}
		
				
		
		
	
	
		
	}


