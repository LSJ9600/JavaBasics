package com.syntax.class06;

import java.util.Scanner;

public class IfCalculator {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers 
		 * and operator(+,-,*,/). Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement.
		 */
	
		Scanner input= new Scanner (System.in);
		System.out.println("Please enter 2 numbers and an operator.");
		
		System.out.println("Enter your first number");
		double num1=input.nextInt();
		
		System.out.println("Enter any operator +,-,*,/ ");
		char operator=input.next().charAt(0);
		
		System.out.println("Enter your second number");
		double num2=input.nextInt();
		
		
		if (operator== '+') {
			System.out.println(num1+num2);
		}else if (operator== '-') {
			System.out.println(num1-num2);
		}else if (operator== '*') {
			System.out.println(num1*num2);
		}else if (operator== '/') {
			System.out.println(num1/num2);
		}else 
			System.out.println("Invalid Entry");
		

	}

}
