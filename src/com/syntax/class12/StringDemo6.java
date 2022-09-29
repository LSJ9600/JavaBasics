package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		
		char [] charArray=str.toCharArray(); // will convert a string to an array of chars
		
		System.out.println(Arrays.toString(charArray)); // prints an array of char
		System.out.println(charArray[7]); // prints specific character 
		System.out.println(charArray); // prints as a string 
		
		
		// the way to show how many times a single letter has repeated in a string.
		int counter=0;
	        
		for(char c:charArray) {

	            if(c=='a') {
	                counter++;
	            }
	        }
	        
		System.out.println("letter a has appread "+counter+" times");

	    }
}
