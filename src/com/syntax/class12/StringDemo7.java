package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		
		String str="I am always confused";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		
		System.out.println(str.substring(5)); // gives us the rest of the part of the string when we specify with the index number
		
		System.out.println(str.substring(5, 11)); // gives us the specific index number from the string starting to end 
		
	}

}
