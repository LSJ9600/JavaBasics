package com.syntax.class12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first name
		 * if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby:
		 * 
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 * 
		 * Example Output:
		 * Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? girl
		 * Suggested baby name: MAIEL
		 */

		String motherName;
		String fatherName;
		String gender;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your mom's name");
		motherName=input.next();
		
		System.out.println("Please enter your dad's name");
		fatherName=input.next();
		
		System.out.println("Is it a boy or girl");
		gender=input.next();
		
		if (gender.toLowerCase().equals("boy")) {
			
			System.out.println("Suggested boy name: " + (fatherName.substring(0, fatherName.length()/2) + motherName.substring(motherName.length()/2)));
		
		} else if (gender.toLowerCase().equals("girl")) {
		
			System.out.println("Suggested girl name: " + (motherName.substring(0, motherName.length()/2) + fatherName.substring(fatherName.length()/2)));
		}
		
	}

}
