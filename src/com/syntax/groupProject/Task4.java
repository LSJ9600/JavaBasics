package com.syntax.groupProject;

public class Task4 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers. 
		// Develop a program which will identify/print the even numbers only.
		
		int[] [] numbers = {
				{44, 27, 90, 62, 15},
				{47, 89, 55, 23, 76}		
		};
		
		for (int a = 0; a < numbers.length; a++) { 

			for (int b = 0; b < numbers[a].length; b++) {

				if (numbers[a][b] % 2 == 0) {
					System.out.print(numbers[a][b] + "  ");
				}
			}
		}
		

	}

}
