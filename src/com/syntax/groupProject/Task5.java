package com.syntax.groupProject;

public class Task5 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.
		
		int[] [] numbers = {
				{44, 27, 90, 62, 15},
				{47, 89, 55, 23, 76}	
		};

		int sumEven=0;
		int sumOdd=0;
		
		for (int a = 0; a < numbers.length; a++) { 

			for (int b = 0; b < numbers[a].length; b++) {

				if (numbers[a][b] % 2 == 0) {
					sumEven+=(numbers[a][b]);}
				else if (numbers[a][b] % 2 != 0) {
					sumOdd+=(numbers[a][b]);}
				
			}
		} System.out.println("Total of odd numbers in the array is: " +sumOdd);
		System.out.println("Total of even numbers in the array is: " +sumEven);
	}

	}


