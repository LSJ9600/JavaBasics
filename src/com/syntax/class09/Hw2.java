package com.syntax.class09;

public class Hw2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.

		
		String[] animal= {"dog", "cat", "bird", "monkey", "bear"};
		
		
		// Regular loop
		
				for(int i=0; i<animal.length; i++) {
				System.out.print(animal[i] + " ");
				}
		
		System.out.println(" ");
		
		
		// Enhanced Loop
		
		 		for(String name:animal) {
	            System.out.print(name + " ");
		 		}
		
		
		
		
		
		
		
		
	}

}
