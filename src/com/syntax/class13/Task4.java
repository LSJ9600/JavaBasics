package com.syntax.class13;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

		String str= "Java is getting more complicated";
		
		String [] a = str.split(" ");
	
		
		for (int i=0; i< a.length; i++) {
			 
			for (int b= a[i].length()-1; b>=0; b--) {
				
				System.out.print(a[i].charAt(b));
				
			}
	
		System.out.print(" ");
		
		}
	}

}
