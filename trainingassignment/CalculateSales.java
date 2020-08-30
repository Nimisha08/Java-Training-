package com.trainingassignment;

import java.util.Scanner;

public class CalculateSales {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int product_num;
		int sold_quantity;
		boolean flag=false;
		double retail=0;
		while(flag=true)
		{
			System.out.println("Product 1: $2.98");
			System.out.println("Product 2: $4.50");
			System.out.println("Product 3: $9.98");
			System.out.println("Product 4: $4.49");
			System.out.println("Product 5: $6.87");
			System.out.println("Exit");
			
			System.out.println("Enter Product Number:");
			product_num=scan.nextInt();
			if(product_num == 6)
				{
				break;
				}
			System.out.println("Enter Sold Quantity:");
			sold_quantity=scan.nextInt();
			
			switch(product_num)
			{
			case 1:
				retail= retail +2.98 * sold_quantity;
				break;
			case 2:
				retail= retail +4.50 * sold_quantity;
				break;
			case 3:
				retail= retail +9.98 * sold_quantity;
				break;
			case 4:
				retail= retail +4.49* sold_quantity;
				break;
			case 5:
				retail= retail +6.87 * sold_quantity;
				break;
				
			}
			System.out.println(retail);
			
			
			
		}
		
		
		
	}
	

}
