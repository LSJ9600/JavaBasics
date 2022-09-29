package com.syntax.groupProject;

public class Task8 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
			int firstTenNumbers = 10;
			int previousNumber = 0;
			int nextNumber = 1;

			System.out.print("Fibonacci Series of the first " + firstTenNumbers + " numbers are: ");

			for (int i = 1; i <= firstTenNumbers; ++i) {
				System.out.print(previousNumber + " ");
				

				int sum = previousNumber + nextNumber;
				previousNumber = nextNumber;
				nextNumber = sum;
			}
		}

	}

