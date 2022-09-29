package com.syntax.groupProject;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[] [] numbers = {
				{35, 27, 90, 62, 15},
				{47, 89, 55, 23, 79}		
		};
		
		
		int sum = 0;
		
		for (int a = 0; a < numbers.length; a++) { 
			
			for (int b = 0; b < numbers[a].length; b++) {
				
				sum += (numbers[a][b]);}
			
		}
		
		System.out.println(sum);
		
		}
	}


