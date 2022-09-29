package com.syntax.class13;

public class Task6 {

	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?

		String a = "Lubna";
		String b = "Shelia";

		System.out.println("String a is " + a + " and String b is " + b);

		a = a + b; 
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());

		System.out.println("If we swap a is " + a + " and b is " + b);
	}
	

}
