package com.syntax.class04;

import java.util.Scanner;

public class YearsWorked {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many years have you worked for?");
		
		double years=scanner.nextDouble();
		
		if (years>=5)
		{ 
			System.out.println("You are eligible for the bonus.");
			System.out.println("How much is your annual salary?");
			
		double salary=scanner.nextDouble();
				
		if (salary>=50000)
		{
			System.out.println("You get a bonus of 5000.");
			
		}
		else 
		{
			System.out.println("You get a bonus of 3000.");
		}
		
		}
		else
		{ 
			System.out.println("You are not eligible for a bonus.");
			
		}

	}

}
