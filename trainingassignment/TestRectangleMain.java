package com.trainingassignment;

public class TestRectangleMain {
	
	public static void main(String[] args) {
		TestRectangle re = new TestRectangle();


		 System.out.println("Area and perimeter of default rectangle ");

		 displayRectData(re);

		 re = new TestRectangle(14, 12);

		 System.out.println("Area and perimeter of new rectangle");

		 displayRectData(re);

		 }

		 public static void displayRectData(TestRectangle r) {

		 System.out.println("Current Dimensions:\n "+ r);

		 System.out.printf("Area of Rectangle: %.2f\nPerimeter of Rectangle: %.2f\n\n",

		 r.computeArea(), r.computePerimeter());

		 }

		 }



