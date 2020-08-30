package com.trainingassignment;

import java.util.Scanner;

public class DupliateNumber {
	public static void main(String[] args) {
		
		int i=0;
        int input[]=new int[100];
        
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.println("Number"+(i+1));
            int n=scan.nextInt();
            
            if(ele (input, n)==false)
            {
                input[i]=n;
                i++;
            }
            else if(ele(input,n)==true)
            {
                System.out.println("Duplicate number is:");
            }
        }while(i<10);
    }
    
    private static boolean ele(int input[], int n)
    {
        for (int i = 0; i < input.length; i++) 
        {
            if(input[i]==n)
            {
                return true;
            }    
        }
        return false;
    }

}
	


