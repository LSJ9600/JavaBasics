package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name= "Lubna";
		String last= "Shelia";
		String grade= "A";
		String city= "Chicago";
		String state= "Illinois";
		String number= "123 456 7890";
		
		System.out.println("My name is " + name + " and my last name is " + last);
		System.out.println("I am " + grade + " student");
		System.out.println("I live in city " + city + " and state " + state);
		System.out.println("And my phone number is " + number);
		
		grade="B";
		city="Buffalo";
		state="New York";
		number="987 654 3210";
		
		System.out.println("My name is " + name + " and i moved to new city " + city + " and new state " + state + " My new phone number is " + number);
		
		
		//Rules for Identifier=names (variables, methods, classes)
		
		//1. cannot use keywords as identifiers
		//Example String new= "Hello"; -> error
		
		//2. cannot have spaces in identifiers
		//Example String last name= "Smith";
		
		//3. identifiers cannot start with numbers but can end with numbers
		// Example int 1number= 123;
		
		/* 4. identifiers cannot contain any special characters
		 * except $ or _
		 * Example boolean hello!=true; 
		 */
		
		/* Naming Convention 
		 * class should start with an upper case and follow camelcasing 
		 * variables should start with lower case and then follow camelcasing
		 */
		
	}

}
