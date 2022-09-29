package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		

		String str= "I love java programming";
		
		System.out.println(str.charAt(2)); //to print out specific character from the string at a specific index
		
		
		System.out.println("*****************");
		
		// to print out the whole string characters altogether
		for (int i=0; i<str.length(); i++) {
			
			//if you dont want to print space between the characters from the string 
			if (!(str.charAt(i)==' ')) {
				
				System.out.println(str.charAt(i)); 
			}
			
			
		}
	}

}
