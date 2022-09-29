package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		// You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?

		String str1="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String [] arr= str1.split("[?]");
		
		System.out.println("There are " + arr.length + " sentences in this string.");
	}

}
