package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str=" i love java ";
       
		System.out.println(str);
       
        System.out.println(str.trim()); //Remove the spaces before and after the String within the colon 
        
        String str2= "Java is Very easy";
        
        System.out.println(str2.startsWith("J")); // checks if a String starts with a specific letter or word
        
        System.out.println(str2.endsWith("y")); // checks if a String Ends with a specific letter or word
        
        System.out.println(str2.contains("very"));// checks if a String Contains a specific letter or word
        
        System.out.println(str2.toLowerCase().contains("very")); // Method changing helps us call multiple methods on a single line one method after another
        
        
	}

}
