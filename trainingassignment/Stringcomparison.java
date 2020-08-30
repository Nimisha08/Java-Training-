package com.trainingassignment;

import java.util.Scanner;

public class Stringcomparison {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter First String:");
		String st1= input.next();
		System.out.println("Enter Second String:");
		String st2= input.next();
		System.out.println(st1.equals(st2));
		System.out.println(st1.compareTo(st2));
		System.out.println(st2.compareTo(st1));
		}

}
