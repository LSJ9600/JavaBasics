package com.syntax.groupProject;

public class Task6 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
		int a = 23;
		int b = 15;

		System.out.println("Number a is " + a + " and number b is " + b);

		a = a + b; 
		b = a - b; 
		a = a - b; 

		System.out.println("If we swap a is " + a + " and b is " + b);
	}

	}


