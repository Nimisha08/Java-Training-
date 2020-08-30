package com.trainingassignment;

import java.util.Scanner;

public class Telephonenumber {

	public static void main(String[] args) {
		
		long num;
		Scanner input=new Scanner(System.in);
		System.out.println( "Enter Telephone Number=");
		num=input.nextLong();
		System.out.println( String.valueOf(num).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		
		}
}
