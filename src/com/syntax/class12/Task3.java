package com.syntax.class12;

public class Task3 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String day= "Sunday";
	    
	    for(int i = day.length()-1; i>=0; i--){
	    
	    	System.out.print(day.charAt(i));
	    }

		
	}

}
