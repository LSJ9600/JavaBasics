package com.syntax.class09;

public class Hw4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] numbers = {23, 85, 59, 10, 78, 31, 45, 99, 28, 17};
		
		int size=numbers.length;
		int largest=0;
		
		for (int num:numbers) {
			
			if (largest<=num) {
				largest=num;
			}
		}
			
		System.out.println("The largest number from your element is: " + largest);
		

	}

}
