package com.syntax.class09;

public class Hw5 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
		
		char[] letters= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		int size=letters.length;
		
		for (int i=size-1; i>=0; i--) {
			
			System.out.print(letters[i] + " ");
			
		}
		
	}

}
