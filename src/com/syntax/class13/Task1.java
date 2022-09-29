package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str= "Today is Sunday. Sunday is good. Java is also good";
		
		System.out.println(str.replaceAll(" ", ""));

	}

}
