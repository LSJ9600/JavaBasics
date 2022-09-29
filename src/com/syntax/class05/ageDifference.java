package com.syntax.class05;

import java.util.Scanner;

public class ageDifference {

	public static void main(String[] args) {
		
		/* prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 *• short (under 60 inch)
		 *• medium(between 60 -72 inch)
		 *• tall (over 72 inch)
		 */
		
		Scanner heigth= new Scanner(System.in);
		
		System.out.println("Enter your height in inches.");
		int inches= heigth.nextInt();
		
		if (inches<60) {
			System.out.println("You are short");
		}else if (inches>=60 && inches<=72) {
			System.out.println("You are medium");
		}else if (inches>72) {
			System.out.println("You are tall");
		}
		
		
	}

}
