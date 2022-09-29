package com.syntax.groupProject;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] numbers = { 35, 27, 90, 62, 15, 47, 89, 55, 23, 79 };
		int max1 = 0;
		int max2 = 0;

		for (int a = 0; a < numbers.length; a++) {
			if(max1<numbers[a]) {
				max2 = max1;
				max1=numbers[a];
			}if (max2<numbers[a] && numbers[a]<max1) {
				max2=numbers[a];
			}
				

		} System.out.println("The second largest number in the array is: " +max2);

	}
}
		

