package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		

		// my way
		String str="Complicated";
		
		if (str.isEmpty()) {
			
			System.out.println("");
		
		} else if (str.length()<3) {
			
			System.out.println("");
		
		} else if (str.length()>3) {
			
			System.out.println("The middle character of the string is " + str.charAt(5));
			
	    }	
		
		System.out.println("*************************************");
		
		 
		// Asghar taught this way
		
		String str1="hello";
		    int length=str1.length();
		    if(!str1.isEmpty()&&length%2!=0&&length>=3) {

		        int middleIndex=length/2;
		        System.out.println(str1.charAt(middleIndex));
		    }
		}
	}


