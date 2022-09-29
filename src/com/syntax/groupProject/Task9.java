package com.syntax.groupProject;

public class Task9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] numbers = { 35, 27, 90, 62, 15, 47, 89, 55, 23, 79 };
		
		int max = numbers[0];
		
		{
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > max)
					max = numbers[i];
			}
			System.out.println("The maximum number is: " + max);

		} for (int a = numbers.length-1; a >=0 ; a--) {
			if (numbers[a] < max)
				max = numbers[a];
		}
		System.out.println("The minimum number is: " + max);
		
		
	}

}
