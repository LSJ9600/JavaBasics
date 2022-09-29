package com.syntax.class09;

public class Hw3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array

		int[] numbers = {23, 85, 59, 10, 78, 31, 45, 99, 28, 17};
		
		int size=numbers.length;
		int sum=0;
		
		for (int add:numbers)
			
			sum+=add;
		
		System.out.println("The sum of array in your element is: "+ sum);
		
		
	}

}
