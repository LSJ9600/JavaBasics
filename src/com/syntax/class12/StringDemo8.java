package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		

		// replace works with ASCII table range
		String str="Batch 14 is good";
		
		System.out.println(str.replace("good", "Excellent")); // replaces one string with another within a string
		
		
		String str1="3824705 ^$(&#* JKDSFHLFIU skjdfnlshf";
		
		System.out.println(str1.replaceAll("[a-z]", "")); // takes a pattern and replace all the characters that follow that pattern
		System.out.println(str1.replaceAll("[fu]", ""));  // you can specify but mention without space and commas
		System.out.println(str1.replaceAll("[^a-z]", "")); // ^ symbol is used to replace all except the ones mentioned
		System.out.println(str1.replaceAll("[^a-zA-Z]", "")); // can mention more than 1 range 
	}

}
