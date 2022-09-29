package com.syntax.class02;

public class HomeWork {

	public static void main(String[] args) {
	
		
		System.out.println("Write a Java program to add, subrtract, multiply and divide 2 decimal values.");
		
		double num1= 9.5;
		double num2= 7.6;
		
		double add= num1+num2;
	    double sub= num1-num2;
		double mul= num1*num2;
		double div= num1/num2;
		
		System.out.println("The addition of 2 numbers " +num1 + " and " +num2 + " is equal to " +add);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " +num2 + " is equal to " +sub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " +num2 + " is equal to " +mul);
		System.out.println("The division of 2 numbers " +num1 + " and " +num2 + " is equal to " +div);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Find the square of the number 3.9.");
		
		double a=3.9;
		double d=3.9*3.9;
		
		System.out.println("The square of the number " + a + " is " + d);
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Print the area and perimeter of a rectangle with width=5 and height=8.");

		int width=5;
		int height=8;
		
		int peri= 2*(width+height);
		int area= width*height;
		
		System.out.println("The perimeter of a rectangle with width " +width + " and height " + height + " is equal to " + peri + " and the area is equal to " + area);
		
		
	}

}
